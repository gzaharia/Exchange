package com.practiceTask.exchange.dto;

import lombok.Data;


@Data
public class RsExchangeRateDto {
    private String currency_code;
    private int rate;
    private float exchange;


}
