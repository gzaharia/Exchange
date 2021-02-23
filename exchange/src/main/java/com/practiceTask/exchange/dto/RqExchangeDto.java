package com.practiceTask.exchange.dto;

import lombok.Data;

@Data
public class RqExchangeDto {

    private String nameOfExchange;
    private String currencyCode;
    private String exchangeRateId;
    private float receivedAmount;
    private float releasedAmount;
    private String operatorId;
}
