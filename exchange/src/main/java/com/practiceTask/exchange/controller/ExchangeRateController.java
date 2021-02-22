package com.practiceTask.exchange.controller;

import com.practiceTask.exchange.domain.ExchangeRate;
import com.practiceTask.exchange.dto.RqCreateExchangeRateDto;
import com.practiceTask.exchange.repository.ExchangeRateRepository;
import com.practiceTask.exchange.service.ExchangeRateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exchange-rate")
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;
    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateController(ExchangeRateService exchangeRateService, ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateService = exchangeRateService;
        this.exchangeRateRepository = exchangeRateRepository;
    }


    @PostMapping("/create")
    @ApiOperation(value = "Simple creation of exchange rates")
    public Mono<ExchangeRate> save(@RequestBody RqCreateExchangeRateDto rateDto) {
        return exchangeRateService.save(rateDto);
    }


}
