package com.practiceTask.exchange.domain;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "exchange_rates")
public class ExchangeRate {

    @Id
    private Long id;

    @Column(value = "currency_code")
    private String currency_code;

    @Column(value = "rate")
    private int rate;

    @Column(value = "exchange")
    private float exchange;
}
