package com.bankaccount.tests;

import static com.bankaccount.bo.Amount.getAmountOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.bankaccount.bo.Account;
import com.bankaccount.bo.Amount;
import com.bankaccount.bo.Transaction;

class TransactionTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Test
	void initializeTransaction() throws ParseException {
		Amount thousand = new Amount(1000);

		Transaction firstTransaction = new Transaction(getAmountOf(1000), sdf.parse("01/01/2022"), "first transaction");
		assertEquals(thousand, firstTransaction.getAmount());
		firstTransaction.setAmount(thousand);
		assertEquals(thousand, firstTransaction.getAmount());
		firstTransaction.setDate(sdf.parse("01/01/2022"));
		assertEquals(sdf.parse("01/01/2022"), firstTransaction.getDate());
		firstTransaction.setAction("modified");
		assertEquals("modified", firstTransaction.getAction());
	}

	@Test
	void depositTransactionToAccount() throws ParseException {
		Amount thousand = new Amount(1000);
		Account account = new Account(getAmountOf(0),null);
		Transaction firstTransaction = new Transaction(getAmountOf(1000), sdf.parse("01/01/2022"), "first deposit");
		account.deposit(firstTransaction);
		assertEquals(thousand, account.getBalance());

	}

	@Test
	void withdrawTransactionToAccount() throws ParseException {
		Account account = new Account(getAmountOf(1000),null);
		Transaction firstTransaction = new Transaction(getAmountOf(1000), sdf.parse("01/01/2022"), "first withdraw");
		account.withdrawal(firstTransaction);
		assertEquals(getAmountOf(0), account.getBalance());

	}
}
