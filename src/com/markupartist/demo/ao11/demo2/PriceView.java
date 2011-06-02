package com.markupartist.demo.ao11.demo2;

import com.markupartist.demo.ao11.R;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.TextView;

public class PriceView extends TextView implements TextWatcher {

    public PriceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!TextUtils.isEmpty(s)
                && getResources().getText(R.string.free).equals(s.toString())) {
            setTextColor(getResources().getColor(R.color.free));
        } else {
            setTextColor(getResources().getColor(R.color.rent));
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
            int after) {
    }

}
