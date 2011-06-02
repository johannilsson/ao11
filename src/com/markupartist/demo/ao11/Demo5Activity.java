package com.markupartist.demo.ao11;

import android.app.Activity;
import android.os.Bundle;

public class Demo5Activity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo5);

        ((NavigationBar) findViewById(R.id.navigation))
            .setBackEnabled();
    }
}