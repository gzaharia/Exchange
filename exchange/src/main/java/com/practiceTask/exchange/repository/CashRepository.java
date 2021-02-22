package com.practiceTask.exchange.repository;

import com.practiceTask.exchange.domain.Cash;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.Date;

public interface CashRepository extends ReactiveCrudRepository<Cash, Long> {
    Flux<Cash> getByCurrencyCodeAndExchangeDate(String currencyCode, Date date);
}
