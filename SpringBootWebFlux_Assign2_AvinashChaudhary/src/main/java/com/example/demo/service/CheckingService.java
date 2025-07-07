package com.example.demo.service;

import com.example.demo.model.Checking;
import com.example.demo.repository.CheckingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CheckingService {

    private final CheckingRepository checkingRepository;

    public Mono<Checking> createCheckingAccount(Checking checking) {
        return checkingRepository.save(checking);
    }

    public Flux<Checking> getAllCheckingAccounts() {
        return checkingRepository.findAll();
    }

    public Mono<Void> deleteCheckingAccount(String id) {
        return checkingRepository.deleteById(id);
    }
}
