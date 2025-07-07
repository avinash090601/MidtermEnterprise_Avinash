package com.example.demo.controller;

import com.example.demo.model.Savings;
import com.example.demo.service.SavingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/accounts/savings")
@RequiredArgsConstructor
public class SavingsController {

    private final SavingsService savingsService;

    @PostMapping
    public Mono<Savings> create(@RequestBody Savings savings) {
        return savingsService.createSavingsAccount(savings);
    }

    @GetMapping
    public Flux<Savings> getAll() {
        return savingsService.getAllSavingsAccounts();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return savingsService.deleteSavingsAccount(id);
    }
}
