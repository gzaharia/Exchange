package com.practiceTask.exchange.repository;

import com.practiceTask.exchange.domain.Exchange;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ExchangeRepository extends ReactiveCrudRepository<Exchange, Long> {
}
