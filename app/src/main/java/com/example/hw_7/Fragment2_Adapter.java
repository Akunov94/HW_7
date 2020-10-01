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
    public List<String> list;
    Context context;
    FragmentFunctions functions;

    public Fragment2_Adapter(List items, Context context, FragmentFunctions i) {
        this.list = items;
        this.context = context;
        this.functions = i;
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
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtNews);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    functions.openUrl(textView.getText().toString());
                }
            });
        }
    }
}
