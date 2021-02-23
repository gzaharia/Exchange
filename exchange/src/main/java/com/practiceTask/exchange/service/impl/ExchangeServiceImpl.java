package com.practiceTask.exchange.service.impl;

import com.practiceTask.exchange.domain.Exchange;
import com.practiceTask.exchange.dto.RqExchangeDto;
import com.practiceTask.exchange.repository.ExchangeRepository;
import com.practiceTask.exchange.service.ExchangeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    private final ExchangeRepository exchangeRepository;

    public ExchangeServiceImpl(ExchangeRepository exchangeRepository) {
        this.exchangeRepository = exchangeRepository;
    }

    //TODO validation for released amount, adding a utils class
    @Override
    public Mono<Exchange> save(RqExchangeDto exchangeDto) {
        Exchange exchange = Exchange.builder()
                .nameOfExchange(exchangeDto.getNameOfExchange())
                .currencyCode(exchangeDto.getCurrencyCode())
                .receivedAmount(exchangeDto.getReceivedAmount())
                .releasedAmount(exchangeDto.getReleasedAmount())
                .operatorId(exchangeDto.getOperatorId())
                .exchangeRateId(exchangeDto.getExchangeRateId())
                .build();

        return exchangeRepository.save(exchange);
    }
}
