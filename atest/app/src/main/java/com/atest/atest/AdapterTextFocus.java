package com.atest.atest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class AdapterTextFocus extends BaseAdapter {
    private static final int res = R.layout.lv_text_focus;
    public List<DataFocus> data;
    public Context context;
    AdapterTextFocus(Context context, List<DataFocus> x) {
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
        ViewHolderTextFocus vh;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(res, parent, false);
            vh = new ViewHolderTextFocus();
            vh.title = view.findViewById(R.id.tv_title);
            vh.item = view.findViewById(R.id.tv_item);
            vh.text = view.findViewById(R.id.tv_text);
            vh.image = view.findViewById(R.id.iv_image);
            view.setTag(vh);
        }else{
            view = convertView;
            vh = (ViewHolderTextFocus)view.getTag();
        }
        vh.title.setText(now.title);
        vh.item.setText(now.item);
        vh.text.setText(now.text);
        vh.image.setImageResource(now.img);
        return view;
    }
}
