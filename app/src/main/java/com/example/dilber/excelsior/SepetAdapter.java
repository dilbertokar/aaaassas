package com.example.dilber.excelsior;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SepetAdapter extends RecyclerView.Adapter<SepetAdapter.ViewHolder>  {
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView image;
        TextView fiyat;

        public ViewHolder(View view) {
            super(view);

            name = view.findViewById(R.id.name);
            image = view.findViewById(R.id.image);
            fiyat = view.findViewById(R.id.txtfiyat);
            ImageView  close=view.findViewById(R.id.imageView);
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos =getPosition();


                }
            });

        }


    }


    ArrayList<Product> sepetlist = new ArrayList<>() ;

    public SepetAdapter(ArrayList<Product> productList) {
        this.sepetlist = productList;
    }

    @Override
    public SepetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sepet_resource, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);


        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(sepetlist.get(position).getIsim());
        holder.fiyat.setText(sepetlist.get(position).getFiyat());
        holder.image.setImageResource(sepetlist.get(position).getResimId());

    }

    @Override
    public int getItemCount() {
        return sepetlist.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
