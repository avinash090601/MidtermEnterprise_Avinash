package com.example.demo.service;

import com.example.demo.model.Savings;
import com.example.demo.repository.SavingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class SavingsService {

    private final SavingsRepository savingsRepository;

    public Mono<Savings> createSavingsAccount(Savings savings) {
        return savingsRepository.save(savings);
    }

    public Flux<Savings> getAllSavingsAccounts() {
        return savingsRepository.findAll();
    }

    public Mono<Void> deleteSavingsAccount(String id) {
        return savingsRepository.deleteById(id);
    }
}
