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
        ImageView delete;

        public ViewHolder(View view) {
            super(view);

            name = view.findViewById(R.id.name);
            image = view.findViewById(R.id.image);
            fiyat = view.findViewById(R.id.txtfiyat);
            delete = view.findViewById(R.id.delete);


        }


    }


    ArrayList<Product> sepetlist = new ArrayList<>() ;
    int toplamfiyat=0;

    public SepetAdapter(ArrayList<Product> productList) {
        this.sepetlist = productList;
        for(Product p:sepetlist){
            toplamfiyat+=Integer.parseInt(p.fiyat);
        }
    }

    @Override
    public SepetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sepet_resource, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);


        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.name.setText(sepetlist.get(position).getIsim());
        holder.fiyat.setText(sepetlist.get(position).getFiyat());
        holder.image.setImageResource(sepetlist.get(position).getResimId());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fiyat=Integer.parseInt(sepetlist.get(position).fiyat);
                toplamfiyat-=fiyat;
                sepetlist.remove(position);
                notifyDataSetChanged();

            }
        });

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
