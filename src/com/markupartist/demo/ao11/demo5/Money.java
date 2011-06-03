package com.markupartist.demo.ao11.demo5;

public class Money {
    private String mAmount;
    private String mCurrency;

    public Money(String amount, String currency) {
        mAmount = amount;
        mCurrency = currency;
    }

    public String getAmount() {
        return mAmount;
    }

    public String getCurrency() {
        return mCurrency;
    }
}
