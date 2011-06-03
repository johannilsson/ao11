package com.markupartist.demo.ao11.widget;

import com.markupartist.demo.ao11.R;
import com.markupartist.demo.ao11.R.id;
import com.markupartist.demo.ao11.R.layout;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class NavigationBar extends RelativeLayout implements OnClickListener {

    private Context mContext;
    private LayoutInflater mInflater;
    private RelativeLayout mNavigationView;
    private Button mNextButton;
    private Button mBackButton;

    public NavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;

        mInflater = (LayoutInflater) mContext.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        mNavigationView = (RelativeLayout) mInflater.inflate(R.layout.navigation, this, true);

        mNextButton = (Button) mNavigationView.findViewById(R.id.navigation_next);
        mBackButton = (Button) mNavigationView.findViewById(R.id.navigation_back);
    }

    public NavigationBar setBackEnabled() {
        mBackButton.setEnabled(true);
        mBackButton.setOnClickListener(this);
        return this;
    }

    public NavigationBar setNextEnabled(Intent intent) {
        mNextButton.setEnabled(true);
        mNextButton.setTag(intent);
        mNextButton.setOnClickListener(this);
        return this;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.navigation_back:
            ((Activity)mContext).finish();
            break;
        case R.id.navigation_next:
            final Object tag = v.getTag();
            if (tag instanceof Intent) {
                final Intent intent = (Intent) tag;
                mContext.startActivity(intent);
            }
            break;
        }
    }

}
