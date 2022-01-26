package com.bankaccount;

import static com.bankaccount.bo.Amount.getAmountOf;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.bankaccount.bo.Account;
import com.bankaccount.bo.Operation;
import com.bankaccount.bo.Transaction;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Account account = new Account(getAmountOf(0), new Operation());
        Transaction firstDeposit = new Transaction(getAmountOf(1000), sdf.parse("01/01/2022"), "initial deposit");
        account.deposit(firstDeposit);
        Transaction secondDeposit = new Transaction(getAmountOf(2000), sdf.parse("02/01/2022"), "second deposit");
        account.deposit(secondDeposit);
        Transaction withdraw = new Transaction(getAmountOf(500), sdf.parse("03/01/2022"), "first withdraw");
        account.withdrawal(withdraw);
        account.printOperation();
    }

}
