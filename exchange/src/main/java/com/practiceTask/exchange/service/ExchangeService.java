package com.practiceTask.exchange.service;

import com.practiceTask.exchange.domain.Exchange;
import com.practiceTask.exchange.dto.RqExchangeDto;
import reactor.core.publisher.Mono;

public interface ExchangeService {

    Mono<Exchange> save(RqExchangeDto exchangeDto);
}
