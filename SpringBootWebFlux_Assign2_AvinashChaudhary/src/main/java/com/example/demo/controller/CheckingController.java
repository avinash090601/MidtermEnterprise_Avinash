package com.example.demo.controller;

import com.example.demo.model.Checking;
import com.example.demo.service.CheckingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/accounts/checking")
@RequiredArgsConstructor
public class CheckingController {

    private final CheckingService checkingService;

    @PostMapping
    public Mono<Checking> create(@RequestBody Checking checking) {
        return checkingService.createCheckingAccount(checking);
    }

    @GetMapping
    public Flux<Checking> getAll() {
        return checkingService.getAllCheckingAccounts();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return checkingService.deleteCheckingAccount(id);
    }
}
