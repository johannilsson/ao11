package com.markupartist.demo.ao11.demo7;

import android.app.Activity;
import android.os.Bundle;

import com.markupartist.demo.ao11.R;
import com.markupartist.demo.ao11.widget.NavigationBar;

public class Demo7Activity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContent();
    }

    private void initContent() {
        setContentView(R.layout.demo7);

        ((NavigationBar) findViewById(R.id.navigation))
            .setBackEnabled();
    }
}