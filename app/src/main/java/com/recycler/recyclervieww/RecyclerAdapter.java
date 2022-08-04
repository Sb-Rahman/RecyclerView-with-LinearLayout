package com.recycler.recyclervieww;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

    Context context;
    ArrayList<Pojo> arrayList;

    public RecyclerAdapter(Context context, ArrayList<Pojo> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout, parent, false);
        MyHolder myHolder = new MyHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        
        holder.recyclerImg.setImageResource(arrayList.get(position).getRecyclerImg());
        holder.recyclerText.setText(arrayList.get(position).getRecyclerText());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        ImageView recyclerImg;
        TextView recyclerText;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            recyclerImg=itemView.findViewById(R.id.recycle_img);
            recyclerText=itemView.findViewById((R.id.recycle_text));

        }
    }
}
