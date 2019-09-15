package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleInstanceTest extends BaseActivity {
    private static final String TAG = "SingleInstanceTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, SingleInstanceTest.this.toString());
        Log.d(TAG, ""+getTaskId());
        setContentView(R.layout.activity_single_instance_test);
        Button a=(Button)findViewById(R.id.a1),b=(Button)findViewById(R.id.a2);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleInstanceTest.this,SingleInstanceTest.class));
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleInstanceTest.this,TestPage.class));
            }
        });
    }
}
