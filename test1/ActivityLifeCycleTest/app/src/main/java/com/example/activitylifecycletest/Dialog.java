package com.example.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Dialog extends BaseActivity {
    private static final String TAG = "Dialog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Log.d(TAG, Dialog.this.toString());
        Log.d(TAG, ""+getTaskId());
    }
}
