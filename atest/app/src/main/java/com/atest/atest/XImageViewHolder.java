package com.atest.atest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.zhpan.viewpager.holder.ViewHolder;

public class XImageViewHolder implements ViewHolder {
    private ImageView iv;
    @Override
    public View createView(Context context, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.banner_item, null);
        iv = view.findViewById(R.id.banner_image);
        return view;
    }
    @Override
    public void onBind(Context context, Object data, int position, int size) {
        iv.setImageResource(R.drawable.ic_launcher_foreground);
    }
}
