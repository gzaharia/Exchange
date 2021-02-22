package com.practiceTask.exchange.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "cash")
public class Cash {

    @Id
    private Long id;

    @Column(value = "operator_id")
    private int operatorId;

    @Column(value = "currency_code")
    private String currency_Code;

    @Column(value = "amount")
    private int amount;

    @Column(value = "exchange_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date exchangeDate;
}
