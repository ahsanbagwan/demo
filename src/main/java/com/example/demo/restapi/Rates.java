package com.example.demo.restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
    private long GBP;

    @Override
    public String toString() {
        return "Rates{" +
                "GBP=" + GBP +
                ", HKD=" + HKD +
                ", USD=" + USD +
                '}';
    }

    public Rates() {

    }

    public long getGBP() {
        return GBP;
    }

    public void setGBP(long GBP) {
        this.GBP = GBP;
    }

    public long getHKD() {
        return HKD;
    }

    public void setHKD(long HKD) {
        this.HKD = HKD;
    }

    public long getUSD() {
        return USD;
    }

    public void setUSD(long USD) {
        this.USD = USD;
    }

    private long HKD;
    private long USD;
}
