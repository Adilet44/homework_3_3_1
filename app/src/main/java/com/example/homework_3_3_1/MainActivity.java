package com.example.homework_3_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> carList;
    private CarAdapter adapter;
    private RecyclerView recyclerView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_car);
        loadData();
        adapter = new CarAdapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList = new ArrayList<>();
        carList.add("Tayota Camry");
        carList.add("Lada Priora");
        carList.add("Kamaz");
        carList.add("Lexus 570");
        carList.add("Audi");
        carList.add("Supra");
        carList.add("Mazda");
        carList.add("Nexya");

    }
}