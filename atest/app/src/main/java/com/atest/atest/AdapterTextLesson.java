package com.atest.atest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterTextLesson extends RecyclerView.Adapter<AdapterTextLesson.ViewHolder> {
    private List<DataTextLesson> list;
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, item1,item2,item3,item4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            item1 = itemView.findViewById(R.id.tv_item1);
            item2 = itemView.findViewById(R.id.tv_item2);
            item3 = itemView.findViewById(R.id.tv_item3);
            item4 = itemView.findViewById(R.id.tv_item4);
        }
    }
    AdapterTextLesson(List<DataTextLesson> x) {
        list = x;
    }
    @Override
    @NonNull public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_text_lesson, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        DataTextLesson now = list.get(i);
        viewHolder.title.setText(now.name);
        viewHolder.item1.setText(now.str1());
        viewHolder.item2.setText(now.str2());
        viewHolder.item3.setText(now.str3());
        viewHolder.item4.setText(now.str4());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
