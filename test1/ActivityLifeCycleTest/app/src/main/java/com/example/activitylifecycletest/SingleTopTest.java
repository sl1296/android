package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleTopTest extends BaseActivity {
    private static final String TAG = "SingleTopTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, SingleTopTest.this.toString());
        Log.d(TAG, ""+getTaskId());
        setContentView(R.layout.activity_single_top_test);
        Button a=(Button)findViewById(R.id.stt1),b=(Button)findViewById(R.id.stt2);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopTest.this,SingleTopTest.class));
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopTest.this,TestPage.class));
            }
        });
    }
}
