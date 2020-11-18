package com.example.demo.restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyBase {

    private String base;
    private Rates rates;
    private Date date;

    @Override
    public String toString() {
        return "CurrencyBase{" +
                "base='" + base + '\'' +
                ", rates=" + rates +
                ", date=" + date +
                '}';
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CurrencyBase() {
    }
}
