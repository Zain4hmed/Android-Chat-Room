package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView recyclerView;
    private ArrayList<Model> modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelArrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        modelArrayList.add(new Model("Zain Ahmed","+91 8919095767"));
        modelArrayList.add(new Model("Ameer Khan","+91 8919095767"));
        modelArrayList.add(new Model("Muzzammil Ahmed Khan","+91 8919095767"));
        modelArrayList.add(new Model("Kousar King","+91 8919095767"));
        modelArrayList.add(new Model("Khatija Yaqut","+91 8919095767"));
        modelArrayList.add(new Model("Zain Ahmed","+91 8919095767"));
        modelArrayList.add(new Model("Ameer Khan","+91 8919095767"));
        modelArrayList.add(new Model("Muzzammil Ahmed Khan","+91 8919095767"));
        modelArrayList.add(new Model("Kousar King","+91 8919095767"));
        modelArrayList.add(new Model("Khatija Yaqut","+91 8919095767"));
        modelArrayList.add(new Model("Zain Ahmed","+91 8919095767"));
        modelArrayList.add(new Model("Ameer Khan","+91 8919095767"));
        modelArrayList.add(new Model("Muzzammil Ahmed Khan","+91 8919095767"));
        modelArrayList.add(new Model("Kousar King","+91 8919095767"));
        modelArrayList.add(new Model("Khatija Yaqut","+91 8919095767"));
        modelArrayList.add(new Model("Zain Ahmed","+91 8919095767"));
        modelArrayList.add(new Model("Ameer Khan","+91 8919095767"));
        modelArrayList.add(new Model("Muzzammil Ahmed Khan","+91 8919095767"));
        modelArrayList.add(new Model("Kousar King","+91 8919095767"));
        modelArrayList.add(new Model("Khatija Yaqut","+91 8919095767"));
        modelArrayList.add(new Model("Zain Ahmed","+91 8919095767"));
        modelArrayList.add(new Model("Ameer Khan","+91 8919095767"));
        modelArrayList.add(new Model("Muzzammil Ahmed Khan","+91 8919095767"));
        modelArrayList.add(new Model("Kousar King","+91 8919095767"));
        modelArrayList.add(new Model("Khatija Yaqut","+91 8919095767"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter(modelArrayList,this);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}