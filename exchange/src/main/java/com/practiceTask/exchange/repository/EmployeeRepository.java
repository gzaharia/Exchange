package com.practiceTask.exchange.repository;

import com.practiceTask.exchange.domain.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long> {
}
