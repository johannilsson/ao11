package com.markupartist.demo.ao11.demo4;

import android.content.Context;
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
                R.layout.demo4_priceview, this, true);

        mAmount = (TextView) priceView.findViewById(R.id.priceview_amount);
        mCurrency = (TextView) priceView.findViewById(R.id.priceview_currency);

        /*if (isInEditMode()) {
            mAmount.setText("10");
            mCurrency.setText("SEK");
        }*/
    }

    public void setMoney(Money money) {
        mAmount.setText(money.getAmount());
        mCurrency.setText(money.getCurrency());
    }
}
