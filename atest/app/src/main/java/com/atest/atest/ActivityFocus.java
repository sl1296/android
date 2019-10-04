package com.atest.atest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityFocus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);
        DataFocus x = new DataFocus(getIntent().getBundleExtra("1"));
        TextView tmp = findViewById(R.id.tv_title);
        tmp.setText(x.str());
        final LinearLayout rewardl=(LinearLayout) findViewById(R.id.rewardl);
        final LinearLayout forwardl=(LinearLayout) findViewById(R.id.forwardl);
        final LinearLayout commentl=(LinearLayout) findViewById(R.id.commentl);
        final LinearLayout likel=(LinearLayout) findViewById(R.id.likel);
        final ImageView reward=(ImageView) findViewById(R.id.reward);
        final ImageView forward=(ImageView) findViewById(R.id.forward);
        final ImageView comment=(ImageView) findViewById(R.id.comment);
        final ImageView like=(ImageView) findViewById(R.id.like);
        final TextView rewardt=(TextView) findViewById(R.id.rewardt);
        final TextView forwardt=(TextView) findViewById(R.id.forwardt);
        final TextView commentt=(TextView) findViewById(R.id.commentt);
        final TextView liket=(TextView) findViewById(R.id.liket);
        rewardl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reward.setImageResource(R.drawable.rewarded);
                rewardt.setTextColor(0xffffba26);
            }
        });
        forwardl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forward.setImageResource(R.drawable.forwarded);
                forwardt.setTextColor(0xffffba26);
            }
        });
        commentl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        likel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                like.setImageResource(R.drawable.liked);
                liket.setTextColor(0xffffba26);
            }
        });
    }

}
