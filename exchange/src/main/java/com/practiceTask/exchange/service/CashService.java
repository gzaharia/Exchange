package com.practiceTask.exchange.service;

import com.practiceTask.exchange.domain.Cash;
import com.practiceTask.exchange.dto.RqCashDto;
import reactor.core.publisher.Flux;

public interface CashService {

    Flux<Cash> getCashByCurrencyCodeAndDate(RqCashDto rqCashDto);

}
