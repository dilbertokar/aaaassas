package com.example.dilber.excelsior;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>  {
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView image;
        TextView fiyat;
        ImageView sepeteekle;

        public ViewHolder(View view) {
            super(view);

           name = view.findViewById(R.id.name);
           image = view.findViewById(R.id.image);
           fiyat = view.findViewById(R.id.txtfiyat);
           sepeteekle = view.findViewById(R.id.sepeteekle);
        }
    }

    ArrayList<Product> productList = new ArrayList<>() ;

    public ListAdapter(ArrayList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_resource, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);


        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.name.setText(productList.get(position).getIsim());
        holder.fiyat.setText(productList.get(position).getFiyat());
        holder.image.setImageResource(productList.get(position).getResimId());
        holder.sepeteekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sepet_activity.sepetlist.add(productList.get(position));


            }
        });

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
