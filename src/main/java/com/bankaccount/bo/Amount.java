package com.bankaccount.bo;

import java.util.Objects;

public class Amount {

    private double value;

    public Amount(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Amount addValue(double value) {
        return getAmountOf(this.value + value);
    }

    public Amount subtractValue(double value) {
        return getAmountOf(this.value - value);
    }

    public boolean isGreaterThan(Amount otherAmount) {
        return this.value > otherAmount.value;
    }

    public static Amount getAmountOf(double amount) {
        return new Amount(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Amount other = (Amount) obj;
            if (value != other.value)
                return false;
            return true;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
