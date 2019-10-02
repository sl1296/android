package com.atest.atest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityFocus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);
        DataFocus x = new DataFocus(getIntent().getBundleExtra("1"));
        TextView tmp = findViewById(R.id.tv_title);
        tmp.setText(x.str());

    }
}
