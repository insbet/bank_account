package com.bankaccount.tests;

import static com.bankaccount.bo.Amount.getAmountOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bankaccount.bo.Account;
import com.bankaccount.bo.Operation;
import com.bankaccount.bo.Transaction;
import org.junit.jupiter.api.Test;


class AccountTest{

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Test
	void initializeAccount() {
		Account firstAccount = new Account(getAmountOf(1000),null);
		firstAccount.printOperation();
		assertEquals(getAmountOf(1000), firstAccount.getBalance());
		Account secondAccount = new Account(null,new Operation());
		secondAccount.printOperation();
		assertEquals(getAmountOf(0), secondAccount.getBalance());
		Account thirdAccount = new Account(getAmountOf(1000), new Operation());
		thirdAccount.printOperation();
		assertEquals(getAmountOf(1000), thirdAccount.getBalance());
	}

	@Test
	void withdrawal() throws ParseException {
		Account account = new Account(getAmountOf(1000),null);
		Date withdrawalDate = sdf.parse("01/01/2022");
		Transaction transaction = new Transaction(getAmountOf(500), withdrawalDate, "first withdraw");
		account.withdrawal(transaction);
		account.printOperation();
		assertEquals(getAmountOf(500), account.getBalance());
	}

	@Test
	void deposit() throws ParseException {
		Account account = new Account(getAmountOf(0),null);
		Date withdrawalDate = sdf.parse("01/01/2022");
		Transaction transaction = new Transaction(getAmountOf(500), withdrawalDate, "first deposit");
		account.deposit(transaction);
		account.printOperation();
		assertEquals(getAmountOf(500), account.getBalance());

	}
}
