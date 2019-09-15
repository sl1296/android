package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleTaskTest extends BaseActivity {
    private static final String TAG = "SingleTaskTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, SingleTaskTest.this.toString());
        Log.d(TAG, ""+getTaskId());
        setContentView(R.layout.activity_siingle_task_test);
        Button a=(Button)findViewById(R.id.kk1),b=(Button)findViewById(R.id.kk2);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskTest.this,SingleTaskTest.class));
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskTest.this,TestPage.class));
            }
        });
    }
}
