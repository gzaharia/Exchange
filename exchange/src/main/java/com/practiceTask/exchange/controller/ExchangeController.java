package com.practiceTask.exchange.controller;

import com.practiceTask.exchange.domain.Exchange;
import com.practiceTask.exchange.dto.RqExchangeDto;
import com.practiceTask.exchange.service.ExchangeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    private final ExchangeService exchangeService;

    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @PostMapping("/create")
    @ApiOperation(value = "Exchange simulation")
    public Mono<Exchange> save(@RequestBody RqExchangeDto exchangeDto) {
        return exchangeService.save(exchangeDto);
    }

}
