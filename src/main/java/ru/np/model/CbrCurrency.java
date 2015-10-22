package ru.np.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CbrCurrency {

    public String code;
    public Double rate;

    @JsonFormat(pattern="yyyy-MM-dd")
    public Date date;

    public CbrCurrency(String code, Double rate, Date date) {
        this.code = code;
        this.rate = rate;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
