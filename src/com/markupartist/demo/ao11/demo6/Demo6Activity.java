package com.markupartist.demo.ao11.demo6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.markupartist.demo.ao11.R;
import com.markupartist.demo.ao11.demo7.Demo7Activity;
import com.markupartist.demo.ao11.widget.NavigationBar;

public class Demo6Activity extends Activity implements OnClickListener {

    private int mCurrentTheme = -1; 

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContent();
    }

    private void initContent() {
        setContentView(R.layout.demo6);

        ((NavigationBar) findViewById(R.id.navigation))
            .setBackEnabled()
            .setNextEnabled(new Intent(this, Demo7Activity.class));

        findViewById(R.id.change_theme).setOnClickListener(this);        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.change_theme:
            if (mCurrentTheme == R.style.AO11Theme) {
                mCurrentTheme = R.style.Demo6Theme;
            } else {
                mCurrentTheme = R.style.AO11Theme;
            }

            setTheme(mCurrentTheme);
            initContent();
            break;
        }
    }
}