package com.example.activitylifecycletest;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TestPage extends BaseActivity {
    private static final String TAG = "TestPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, TestPage.this.toString());
        Log.d(TAG, ""+getTaskId());
        setContentView(R.layout.activity_test_page);
        Button a=(Button)findViewById(R.id.sTop),b=(Button)findViewById(R.id.sTask),c=(Button)findViewById(R.id.sIns),d=(Button)findViewById(R.id.endd);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestPage.this,SingleTopTest.class));
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestPage.this,SingleTaskTest.class));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestPage.this,SingleInstanceTest.class));
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }
}
