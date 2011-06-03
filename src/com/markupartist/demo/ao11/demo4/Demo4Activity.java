package com.markupartist.demo.ao11.demo4;

import java.util.Random;

import com.markupartist.demo.ao11.R;
import com.markupartist.demo.ao11.R.id;
import com.markupartist.demo.ao11.R.layout;
import com.markupartist.demo.ao11.R.string;
import com.markupartist.demo.ao11.demo5.Demo5Activity;
import com.markupartist.demo.ao11.widget.NavigationBar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Demo4Activity extends Activity implements OnClickListener {
    private static final Random RANDOM = new Random();
    private static final Money MONEY_1 = new Money("37", "SEK");
    private static final Money MONEY_2 = new Money("19", "SEK");

    private PriceView mPriceView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo4);

        ((NavigationBar) findViewById(R.id.navigation))
            .setBackEnabled()
            .setNextEnabled(new Intent(this, Demo5Activity.class));

        Button randomButton = (Button) findViewById(R.id.randomize);
        randomButton.setText(R.string.more_money);
        randomButton.setOnClickListener(this);

        initPriceTextView();
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
        case R.id.randomize:
            mPriceView.setMoney(RANDOM.nextBoolean() ? MONEY_1 : MONEY_2);
            break;
        }
    }

    void initPriceTextView() {
        mPriceView = (PriceView) findViewById(R.id.price);
    }
}