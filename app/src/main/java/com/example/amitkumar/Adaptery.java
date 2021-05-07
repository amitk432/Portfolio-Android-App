package com.example.amitkumar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {

    private final Context mContext ;
    private final List<ModelClass> mData;

    public Adaptery(Context mContext, List<ModelClass> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater = LayoutInflater.from(mContext) ;
        v = inflater.inflate(R.layout.projects_items, parent, false) ;

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.id.setText(mData.get(position).getId());
        holder.name.setText(mData.get(position).getName()) ;

        Glide.with(mContext)
                .load(mData.get(position).getImg())
                .into(holder.img) ;


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView id ;
        TextView name ;
        ImageView img ;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            id = itemView.findViewById(R.id.id_txt) ;
            name = itemView.findViewById(R.id.name_txt) ;
            img = itemView.findViewById(R.id.imageView) ;


        }
    }

}
