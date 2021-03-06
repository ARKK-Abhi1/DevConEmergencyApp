package com.example.ashi.devconemergencyapp.Adapter;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ashi.devconemergencyapp.R;
import com.example.ashi.devconemergencyapp.rest.Location;
import com.example.ashi.devconemergencyapp.rest.Results;

import java.util.List;

public class MechanicsAdapter extends RecyclerView.Adapter {

    public MechanicsAdapter()
    {

    }
    class MechanicsHolder extends RecyclerView.ViewHolder{
        TextView name;
        public MechanicsHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_layout, viewGroup, false);
                return new MechanicsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int position) {

                MechanicsHolder mechanicsHolder=(MechanicsHolder) viewHolder;
        }


    @Override
    public int getItemCount() {
        return 2;
    }

}
