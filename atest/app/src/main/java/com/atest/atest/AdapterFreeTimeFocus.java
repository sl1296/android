package com.atest.atest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class AdapterFreeTimeFocus extends BaseAdapter {
    private static final int res = R.layout.lv_freetime_focus;
    public List<DataFocus> data;
    public Context context;
    AdapterFreeTimeFocus(Context context, List<DataFocus> x) {
        this.context = context;
        data = x;
    }
    @Override
    public int getCount() {
        return data.size();
    }
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataFocus now = (DataFocus) getItem(position);
        View view;
        ViewHolderFreeTimeFocus vh;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(res, parent, false);
            vh = new ViewHolderFreeTimeFocus();
            vh.title = view.findViewById(R.id.tv_title);
            vh.item = view.findViewById(R.id.tv_item);
            vh.image = view.findViewById(R.id.iv_image);
            view.setTag(vh);
        }else{
            view = convertView;
            vh = (ViewHolderFreeTimeFocus)view.getTag();
        }
        vh.title.setText(now.title);
        vh.item.setText(now.item);
        vh.image.setImageResource(R.drawable.ic_launcher_foreground);
        return view;
    }
}
