package com.practiceTask.exchange.repository;

import com.practiceTask.exchange.domain.ExchangeRate;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ExchangeRateRepository extends ReactiveCrudRepository<ExchangeRate, Long> {

}
