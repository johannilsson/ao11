package com.markupartist.demo.ao11.demo5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.markupartist.demo.ao11.R;
import com.markupartist.demo.ao11.demo6.Demo6Activity;
import com.markupartist.demo.ao11.widget.NavigationBar;

public class Demo5Activity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo5);

        ((NavigationBar) findViewById(R.id.navigation))
            .setBackEnabled()
            .setNextEnabled(new Intent(this, Demo6Activity.class));
    }
}