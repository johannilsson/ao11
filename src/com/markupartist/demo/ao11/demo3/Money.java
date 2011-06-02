package com.markupartist.demo.ao11.demo3;

public class Money {
    private String mValue;
    private String mCurrency;

    public Money(String value, String currency) {
        mValue = value;
        mCurrency = currency;
    }

    public String getValue() {
        return mValue;
    }

    public String getCurrency() {
        return mCurrency;
    }
}
