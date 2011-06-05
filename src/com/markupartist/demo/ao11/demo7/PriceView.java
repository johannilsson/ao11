package com.markupartist.demo.ao11.demo7;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;

import com.markupartist.demo.ao11.R;

public class PriceView extends TextView {

    private int mAmountTextColor;

    public PriceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(
                attrs, R.styleable.PriceView, 0, 0);

        String amountText = array.getString(R.styleable.PriceView_amountText);
        String currencyText = array.getString(R.styleable.PriceView_currencyText);
        mAmountTextColor = array.getColor(R.styleable.PriceView_amountTextColor,
                getResources().getColor(android.R.color.white));

        array.recycle();

        Money money = null;
        if (!TextUtils.isEmpty(amountText) && !TextUtils.isEmpty(currencyText)) {
            money = new Money(amountText, currencyText);
        }

        setMoney(money);
    }

    private CharSequence buildText(Money money) {
        SpannableString spannable = new SpannableString(
                String.format("%s %s", money.getAmount(), money.getCurrency())
        );
        spannable.setSpan(new ForegroundColorSpan(mAmountTextColor),
                0, money.getAmount().length(), 0);
        return spannable;
    }

    public void setMoney(Money money) {
        if (money != null) {
            setText(buildText(money));
        }
    }
}
