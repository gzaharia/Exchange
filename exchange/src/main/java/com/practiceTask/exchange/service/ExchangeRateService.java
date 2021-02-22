package com.practiceTask.exchange.service;

import com.practiceTask.exchange.domain.ExchangeRate;
import com.practiceTask.exchange.dto.RqCreateExchangeRateDto;
import reactor.core.publisher.Mono;

public interface ExchangeRateService {

    Mono<ExchangeRate> save(RqCreateExchangeRateDto rateDto);

}
