package com.markupartist.demo.ao11;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Demo2Activity extends Activity implements OnClickListener {
    private static final Random RANDOM = new Random();
    private TextView mPriceTextView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo2);

        NavigationBar navigation = (NavigationBar) findViewById(R.id.navigation);
        navigation
            .setBackEnabled()
            .setNextEnabled(new Intent(this, Demo3Activity.class));

        findViewById(R.id.randomize).setOnClickListener(this);
        initPriceTextView();
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
        case R.id.randomize:
            mPriceTextView.setText(RANDOM.nextBoolean() ? "Free" : "37 SEK");
            break;
        }
    }

    void initPriceTextView() {
        mPriceTextView = (TextView) findViewById(R.id.price);
    }
}