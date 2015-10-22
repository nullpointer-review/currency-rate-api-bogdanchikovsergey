package ru.np.service;

import ru.np.model.CbrCurrency;

import java.util.Date;

public interface CbrFetcherService {

    public CbrCurrency getCursOnDateXML(String code);

    public CbrCurrency getCursOnDateXML(String code, Date date);
}
