package com.practiceTask.exchange.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "exchange")
public class Exchange {

    @Id
    private Long id;

    @Column(value = "name_of_exchange")
    private String nameOfExchange;

    @Column(value = "currency_code")
    private String currencyCode;

    @Column(value = "exchange_rate_id")
    private String exchangeRateId;

    @Column(value = "received_amount")
    private float receivedAmount;

    @Column(value = "released_amount")
    private float releasedAmount;

    @Column(value = "operator_id")
    private String operatorId;
}
