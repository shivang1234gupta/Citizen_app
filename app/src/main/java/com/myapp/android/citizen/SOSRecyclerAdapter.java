package com.myapp.android.citizen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SOSRecyclerAdapter extends RecyclerView.Adapter<SOSRecyclerAdapter.sosViewHolder> {



    @NonNull
    @Override
    public sosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.sos_card,parent,false);
        return new sosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class sosViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;
        TextView sosNumber;
        View root;
        public sosViewHolder(@NonNull View itemView) {
            super(itemView);
            root=itemView;
            imageView=root.findViewById(R.id.sosRow_imageView);
            title=root.findViewById(R.id.sos_title);
            sosNumber=root.findViewById(R.id.sosNumber);
        }
    }
}
