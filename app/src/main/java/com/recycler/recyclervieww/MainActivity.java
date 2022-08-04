package com.recycler.recyclervieww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pojo> arrayList;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allData();

        recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        recyclerAdapter=new RecyclerAdapter(this,arrayList);
        recyclerView.setAdapter(recyclerAdapter);


    }

    private void allData() {
        arrayList=new ArrayList<Pojo>();
        arrayList.add(new Pojo(R.drawable.sample_img,"This is simple text"));
        arrayList.add(new Pojo(R.drawable.bipul,"This is simple text"));
        arrayList.add(new Pojo(R.drawable.raw,"This is simple text"));

    }
}