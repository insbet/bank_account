package com.bankaccount.bo;

public class OperationDetail {

    private Transaction transaction;
    private Amount currentBalance;

    public OperationDetail(Transaction transaction, Amount balance) {
        this.transaction = transaction;
        this.currentBalance = balance;
    }

    public void print() {
        this.transaction.print(currentBalance);
    }

}
