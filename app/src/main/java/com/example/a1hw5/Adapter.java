package com.example.a1hw5;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private ArrayList<Model> list;
    private Listener listener;
    private Context context;


    public Adapter(Listener listener, ArrayList<Model> list) {
        this.listener = listener;
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(v -> {
            listener.onClickListener(list.get(position
            ));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView country, city;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            country = itemView.findViewById(R.id.tv_country);
            city = itemView.findViewById(R.id.tv_city);

        }

        public void bind(Model model) {
            imageView.setImageResource(model.getImage());
            country.setText(model.getCountry());
            city.setText(model.getCity());
        }
    }
}
