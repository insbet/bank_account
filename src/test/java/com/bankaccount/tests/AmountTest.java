package com.bankaccount.tests;

import static com.bankaccount.bo.Amount.getAmountOf;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.bankaccount.bo.Amount;

class AmountTest {

	@Test
	void initializeAmount() {
		Amount amount = new Amount(0);
		amount.setValue(0);
		assertEquals(new Amount(0), amount);
	}

	@Test
	void addAmount() {
		Amount amount = new Amount(0);
		assertEquals(getAmountOf(0), amount);
		amount = amount.addValue(10);
		assertEquals(getAmountOf(10), amount);
		amount = amount.addValue(20);
		assertEquals(getAmountOf(30), amount);
		assertNotEquals(getAmountOf(20), amount);
		assertNotEquals(null, amount);
		assertTrue(amount.isGreaterThan(getAmountOf(0)));
		assertFalse(getAmountOf(10).isGreaterThan(amount));
	}

	@Test
	void subtractAmount() {
		Amount amount = new Amount(100);
		assertEquals(getAmountOf(100), amount);
		amount = amount.subtractValue(50);
		assertEquals(getAmountOf(50), amount);
		amount = amount.subtractValue(20);
		assertEquals(getAmountOf(30), amount);
	}

}
