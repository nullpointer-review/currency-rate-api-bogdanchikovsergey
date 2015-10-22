package ru.np.service.impl;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.np.model.CbrCurrency;
import ru.np.service.CbrFetcherService;
import ru.np.service.cbr.GetCursOnDateXML;
import ru.np.service.cbr.GetCursOnDateXMLResponse;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static ru.np.service.cbr.GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData.ValuteCursOnDate;

@Component
public class CbrFetcherServiceImpl extends WebServiceGatewaySupport implements CbrFetcherService {

    private static Logger logger = Logger.getLogger(CbrFetcherServiceImpl.class);
    private static final String CACHE_ID = "currency";

    @Override
    @Cacheable(CACHE_ID)
    public CbrCurrency getCursOnDateXML(String code) {

        // если дата отсутствует, по умолчанию используем дату завтрашнего дня

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, 1);

        return getCursOnDateXML(code, cal.getTime());
    }

    @Override
    @Cacheable(CACHE_ID)
    public CbrCurrency getCursOnDateXML(String code, Date date) {

        logger.info("getCursOnDateXML start");

        GetCursOnDateXML request = new GetCursOnDateXML();

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);

        try {
            request.setOnDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
        } catch (DatatypeConfigurationException e) {
            logger.error(e);
            return null;
        }

        GetCursOnDateXMLResponse response = (GetCursOnDateXMLResponse) getWebServiceTemplate()
                .marshalSendAndReceive(
                        "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx",
                        request,
                        new SoapActionCallback("http://web.cbr.ru/GetCursOnDateXML"));

        logger.info("getCursOnDateXML got response: " + response);

        List<ValuteCursOnDate> values = response.getGetCursOnDateXMLResult().getValuteData().getValuteCursOnDate();

        for(ValuteCursOnDate cursOnDate : values) {

            if(cursOnDate.getVchCode().equals(code)) {

                // для части валют (например, для японских йен) возвращается курс за vnom (10/100/1000) единиц
                // курс за 1 едиицу = vcurs / vnom

                return new CbrCurrency(cursOnDate.getVchCode(),
                        Double.parseDouble(cursOnDate.getVcurs()) / Double.parseDouble(cursOnDate.getVnom()),
                        date);
            }
        }

        // TODO возвращать более информативную ошибку

        return null;
    }
}
