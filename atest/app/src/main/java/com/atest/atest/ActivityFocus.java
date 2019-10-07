package com.atest.atest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityFocus extends AppCompatActivity {
    private boolean r = false, f = false, c = false, l = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);
        DataFocus x = new DataFocus(getIntent().getBundleExtra("1"));
        TextView tmp = findViewById(R.id.tv_title);
        tmp.setText(x.str());
        final ImageView reward=(ImageView) findViewById(R.id.reward);
        final ImageView forward=(ImageView) findViewById(R.id.forward);
        final ImageView comment=(ImageView) findViewById(R.id.comment);
        final ImageView like=(ImageView) findViewById(R.id.like);
        final TextView rewardt=(TextView) findViewById(R.id.rewardt);
        final TextView forwardt=(TextView) findViewById(R.id.forwardt);
        final TextView commentt=(TextView) findViewById(R.id.commentt);
        final TextView liket=(TextView) findViewById(R.id.liket);
        findViewById(R.id.rewardl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r) {
                    reward.setImageResource(R.drawable.reward);
                    rewardt.setTextColor(0x8a000000);
                } else {
                    reward.setImageResource(R.drawable.rewarded);
                    rewardt.setTextColor(0xffffba26);
                }
                r = !r;
            }
        });
        findViewById(R.id.forwardl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f) {
                    forward.setImageResource(R.drawable.forward);
                    forwardt.setTextColor(0x8a000000);
                } else {
                    forward.setImageResource(R.drawable.forwarded);
                    forwardt.setTextColor(0xffffba26);
                }
                f = !f;
            }
        });
        findViewById(R.id.commentl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c) {
                    comment.setImageResource(R.drawable.comment);
                    commentt.setTextColor(0x8a000000);
                } else {
                    comment.setImageResource(R.drawable.commented);
                    commentt.setTextColor(0xffffba26);
                }
                c = !c;
            }
        });
        findViewById(R.id.likel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l) {
                    like.setImageResource(R.drawable.like);
                    liket.setTextColor(0x8a000000);
                } else {
                    like.setImageResource(R.drawable.liked);
                    liket.setTextColor(0xffffba26);
                }
                l= !l;
            }
        });
    }

}
