package com.practiceTask.exchange.service.impl;

import com.practiceTask.exchange.domain.ExchangeRate;
import com.practiceTask.exchange.dto.RqCreateExchangeRateDto;
import com.practiceTask.exchange.repository.ExchangeRateRepository;
import com.practiceTask.exchange.service.ExchangeRateService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateServiceImpl(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    @Override
    public Mono<ExchangeRate> save(RqCreateExchangeRateDto rateDto) {
        ExchangeRate exchangeRate = ExchangeRate.builder()
                .currency_code(rateDto.getCurrency_code())
                .exchange(rateDto.getRate())
                .rate(rateDto.getRate())
                .build();

        return exchangeRateRepository.save(exchangeRate);
    }


}
