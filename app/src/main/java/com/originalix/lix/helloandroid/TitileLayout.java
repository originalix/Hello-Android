package com.originalix.lix.helloandroid;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.originalix.lix.helloandroid.R;

/**
 * Created by Lix on 2017/8/5.
 */

public class TitileLayout extends LinearLayout {

    public TitileLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
    }
}
