package com.bankaccount.bo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Transaction {

    private Amount amount;
    private Date date;
    private String action;
    private static final String DATE_FORMAT = "dd/MM/yyyy";

    private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    public Transaction(Amount amount, Date date, String action) {
        this.amount = amount;
        this.date = date;
        this.action = action;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Amount balanceAfterTransaction(Amount currentBalance, String sign) {
        return amount;
    }

    public void print(Amount balance) {
    }

    private void addCurrentBalanceTo(StringBuilder builder, Amount currentBalance) {
    }

}
