package com.practiceTask.exchange.controller;

import com.practiceTask.exchange.domain.Cash;
import com.practiceTask.exchange.dto.RqCashDto;
import com.practiceTask.exchange.service.CashService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/cash")
public class CashController {

    private final CashService cashService;

    public CashController(CashService cashService) {
        this.cashService = cashService;
    }

    @GetMapping("/get")
    @ApiOperation(value = "Retrieve cash by currency code and date")
    public Flux<Cash> getCashByCurrencyAndDate(@RequestBody RqCashDto rqCashDto) {
        return cashService.getCashByCurrencyCodeAndDate(rqCashDto);
    }
}
