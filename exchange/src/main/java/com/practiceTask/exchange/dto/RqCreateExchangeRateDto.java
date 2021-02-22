package com.practiceTask.exchange.dto;

public class RqCreateExchangeRateDto {

    private String currency_code;
    private int rate;
    private float exchange;

    public RqCreateExchangeRateDto() {
    }

    public RqCreateExchangeRateDto(String currency_code, int rate, float exchange) {
        this.currency_code = currency_code;
        this.rate = rate;
        this.exchange = exchange;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getExchange() {
        return exchange;
    }

    public void setExchange(float exchange) {
        this.exchange = exchange;
    }
}
