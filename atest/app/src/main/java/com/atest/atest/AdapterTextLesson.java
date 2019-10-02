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
        TextView title, item;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            item = itemView.findViewById(R.id.tv_item);
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
        viewHolder.item.setText(now.str());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
