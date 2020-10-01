package com.example.hw_7;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Fragment2_Adapter extends RecyclerView.Adapter<Fragment2_Adapter.ViewHolder>{
    public List<ItemNews> list;
    Context context;

    public Fragment2_Adapter(List<ItemNews> list, Context context) {
        this.list = list;
        this.context = context;
    }
    public void addApplication(ItemNews title) {
//        list.add(title);
        for (int i = 0; i < 10; i++) {
            list.add(new ItemNews("oooo","fffff"));
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Fragment2_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.newsitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Fragment2_Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtNews;
        ItemNews itemNews;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtTitle);
            txtNews = itemView.findViewById(R.id.txtNews);

        }
        public void onBind(ItemNews itemNews) {
            this.itemNews = itemNews;
            txtName.setText(itemNews.title);
            txtNews.setText(itemNews.news);
        }
    }
}
