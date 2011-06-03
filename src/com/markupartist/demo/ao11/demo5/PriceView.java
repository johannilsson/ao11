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

    private TextView mAmount;
    private TextView mCurrency;

    public PriceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout priceView = (LinearLayout) inflater.inflate(
                R.layout.demo5_priceview, this, true);

        mAmount = (TextView) priceView.findViewById(R.id.priceview_amount);
        mCurrency = (TextView) priceView.findViewById(R.id.priceview_currency);

        TypedArray array = context.obtainStyledAttributes(
                attrs, R.styleable.PriceView, 0, 0);

        String valueText = array.getString(R.styleable.PriceView_amountText);
        if (!TextUtils.isEmpty(valueText)) {
            mAmount.setText(valueText);
        }
        String currencyText = array.getString(R.styleable.PriceView_currencyText);
        if (!TextUtils.isEmpty(currencyText)) {
            mCurrency.setText(currencyText);
        }

        array.recycle();
    }

    public void setMoney(Money money) {
        mAmount.setText(money.getAmount());
        mCurrency.setText(money.getCurrency());
    }
}
