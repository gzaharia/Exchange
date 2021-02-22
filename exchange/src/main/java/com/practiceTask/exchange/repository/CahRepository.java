package com.practiceTask.exchange.repository;

import com.practiceTask.exchange.domain.Cash;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CahRepository extends ReactiveCrudRepository<Cash, Long> {
}
