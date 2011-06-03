package com.markupartist.demo.ao11.demo5;

import com.markupartist.demo.ao11.R;
import com.markupartist.demo.ao11.R.id;
import com.markupartist.demo.ao11.R.layout;
import com.markupartist.demo.ao11.widget.NavigationBar;

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