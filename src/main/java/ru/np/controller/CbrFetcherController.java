package ru.np.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.np.model.CbrCurrency;
import ru.np.service.CbrFetcherService;

import java.util.Date;

@RestController
public class CbrFetcherController {

    @Autowired
    private CbrFetcherService cbrFetcherService;

    // TODO обработка ошибок в случае неправильных параметров

    @RequestMapping("/api/rate/{code}")
    public CbrCurrency getCbrCurrencyXML(@PathVariable String code) {
        return cbrFetcherService.getCursOnDateXML(code);
    }

    @RequestMapping("/api/rate/{code}/{date}")
    public CbrCurrency getCbrCurrencyXMLDate(@PathVariable String code,
                                                          @PathVariable @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date date) {
        return cbrFetcherService.getCursOnDateXML(code, date);
    }
}