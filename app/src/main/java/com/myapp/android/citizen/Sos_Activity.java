package com.myapp.android.citizen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Sos_Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
     private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_);
        recyclerView=findViewById(R.id.sos_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new SOSRecyclerAdapter();
        recyclerView.setAdapter(adapter);
    }
}
