package com.example.demo.model;

public interface Account {
    String getAccountHolder();
    double getBalance();
    void deposit(double amount);
    void withdrawal(double amount);
    void updateBalance(double newBalance);
}
