package com.bankaccount.bo;

public class Account {
    private Amount balance;
    private Operation operation;

    public Account(Amount amount) {
        this.balance = amount;
        this.operation=new Operation();
    }

    public Account(Operation operation) {
        this.operation = operation;
        this.balance = Amount.getAmountOf(0);
    }

    public Account(Amount amount, Operation operation) {
        this.balance = amount;
        this.operation = operation;
    }

    public Amount getBalance() {
        return balance;
    }

    public void withdrawal(Transaction transaction) {
        addTransaction(transaction,"-");
    }

    public void deposit(Transaction transaction) {
        addTransaction(transaction,"+");
    }

    private void addTransaction(Transaction transaction, String sign) {
        Amount newBalance = transaction.balanceAfterTransaction(balance, sign);
        balance = newBalance;
        operation.addLineContaining(transaction, newBalance);
    }

    public void printOperation() {
        operation.printTo(System.out);
    }
}
