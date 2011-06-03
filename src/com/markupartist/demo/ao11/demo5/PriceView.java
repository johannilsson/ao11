package com.markupartist.demo.ao11.demo5;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.markupartist.demo.ao11.R;

public class PriceView extends LinearLayout {

    private TextView mValue;
    private TextView mCurrency;

    public PriceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout priceView = (LinearLayout) inflater.inflate(
                R.layout.demo5_priceview, this, true);

        mValue = (TextView) priceView.findViewById(R.id.priceview_value);
        mCurrency = (TextView) priceView.findViewById(R.id.priceview_currency);

        TypedArray array = context.obtainStyledAttributes(
                attrs, R.styleable.Demo5PriceView, 0, 0);

        String valueText = array.getString(R.styleable.Demo5PriceView_valueText);
        if (!TextUtils.isEmpty(valueText)) {
            mValue.setText(valueText);
        }
        String currencyText = array.getString(R.styleable.Demo5PriceView_currencyText);
        if (!TextUtils.isEmpty(currencyText)) {
            mCurrency.setText(currencyText);
        }

        array.recycle();
    }

    public void setMoney(Money money) {
        mValue.setText(money.getValue());
        mCurrency.setText(money.getCurrency());
    }
}