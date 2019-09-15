package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Normal extends BaseActivity {
    private static final String TAG = "Normal";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, Normal.this.toString());
        Log.d(TAG, ""+getTaskId());
        setContentView(R.layout.activity_normal);
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed: ");
        Intent in=new Intent();
        in.putExtra("return_data","hello main");
        setResult(RESULT_OK,in);
        finish();
    }
}
