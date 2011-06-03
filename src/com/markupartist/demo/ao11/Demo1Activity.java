package com.markupartist.demo.ao11;

import java.util.Random;

import com.markupartist.demo.ao11.widget.NavigationBar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Demo1Activity extends Activity implements OnClickListener {
    private static final Random RANDOM = new Random();
    private TextView mPriceTextView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);

        NavigationBar navigation = (NavigationBar) findViewById(R.id.navigation);
        navigation.setNextEnabled(new Intent(this, Demo2Activity.class));

        findViewById(R.id.randomize).setOnClickListener(this);

        initPriceTextView();
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
        case R.id.randomize:
            mPriceTextView.setText(RANDOM.nextBoolean() ?
                    getText(R.string.free) : "37 SEK");
            break;
        }
    }

    void initPriceTextView() {
        mPriceTextView = (TextView) findViewById(R.id.price);
        mPriceTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                    int count) {
                if (getText(R.string.free).equals(s.toString())) {
                    mPriceTextView.setTextColor(getResources().getColor(R.color.free));
                } else {
                    mPriceTextView.setTextColor(getResources().getColor(R.color.rent));
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                    int after) { }

            @Override
            public void afterTextChanged(Editable s) { }
        });
    }

}