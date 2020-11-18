package com.example.demo.restapi;

import org.springframework.web.client.RestTemplate;

public class RatesApiService {
    private RestTemplate template;

    public CurrencyBase findAll() {
        CurrencyBase base = template.getForObject("https://api.ratesapi.io/api/latest?base=EUR&symbols=GBP,USD,HKD", CurrencyBase
                .class);
        return base;
    }
}
