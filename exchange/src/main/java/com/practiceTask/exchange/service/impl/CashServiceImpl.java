package com.practiceTask.exchange.service.impl;

import com.practiceTask.exchange.domain.Cash;
import com.practiceTask.exchange.dto.RqCashDto;
import com.practiceTask.exchange.repository.CashRepository;
import com.practiceTask.exchange.service.CashService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CashServiceImpl implements CashService {

    private final CashRepository cashRepository;

    @Override
    public Flux<Cash> getCashByCurrencyCodeAndDate(RqCashDto rqCashDto) {
        Flux<Cash> cash = cashRepository.getByCurrencyCodeAndExchangeDate(rqCashDto.getCurrencyCode(), rqCashDto.getDate());

        return cash;
    }

}
