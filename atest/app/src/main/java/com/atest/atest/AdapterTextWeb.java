package com.atest.atest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class AdapterTextWeb extends BaseAdapter {
    private static final int res = R.layout.lv_text_web;
    public List<DataTextWeb> data;
    public Context context;
    AdapterTextWeb(Context context, List<DataTextWeb> x) {
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
        DataTextWeb now = (DataTextWeb) getItem(position);
        View view;
        ViewHolderTextWeb vh;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(res, parent, false);
            vh = new ViewHolderTextWeb();
            vh.title = view.findViewById(R.id.tv_title);
            vh.item = view.findViewById(R.id.tv_item);
            view.setTag(vh);
        }else{
            view = convertView;
            vh = (ViewHolderTextWeb)view.getTag();
        }
        vh.title.setText(now.title);
        vh.item.setText(now.item);
        return view;
    }
}