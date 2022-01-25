package com.bankaccount.bo;

public class Account {
    private Amount balance;
    private Operation operation;

    public Account(Amount amount, Operation operation) {
        this.balance = amount;
        this.operation = operation;
    }

    public Amount getBalance() {
        return balance;
    }

    public void withdrawal(Transaction transaction) {
    }

    public void deposit(Transaction transaction) {
    }

    public void printOperation() {
        operation.printTo(System.out);
    }
}
