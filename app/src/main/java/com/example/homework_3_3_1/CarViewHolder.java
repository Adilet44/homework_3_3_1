package com.example.homework_3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCar ;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);

    }

    void bind (String car){

        tvCar.setText(car);

    }
}
