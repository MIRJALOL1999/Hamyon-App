package com.example.aqillihamyon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myviewholder> {

    Context context;
    ArrayList<Model> myarraylist;

    public MyAdapter(Context context, ArrayList<Model> myarraylist) {
        this.context = context;
        this.myarraylist = myarraylist;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        Model model=myarraylist.get(position);
        holder.textView.setText(model.getName());
        holder.imageView.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return myarraylist.size();
    }

    public  class Myviewholder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txtview2);
            imageView=itemView.findViewById(R.id.imgview2);
        }
    }
}
