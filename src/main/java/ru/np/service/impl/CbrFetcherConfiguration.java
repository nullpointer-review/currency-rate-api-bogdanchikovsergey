package ru.np.service.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CbrFetcherConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("ru.np.service.cbr");
        return marshaller;
    }

    @Bean
    public CbrFetcherServiceImpl cbrFetcherService(Jaxb2Marshaller marshaller) {
        CbrFetcherServiceImpl client = new CbrFetcherServiceImpl();
        client.setDefaultUri("http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
