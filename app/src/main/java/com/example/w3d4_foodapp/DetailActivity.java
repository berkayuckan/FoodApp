package com.example.w3d4_foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent=getIntent();
        intent.getExtras();
        FoodModel foodModel=(FoodModel) getIntent().getSerializableExtra("model");

        TextView textViewFoodTime=findViewById(R.id.TextViewFoodTime);
        TextView textViewFoodInfo=findViewById(R.id.TextViewFoodInfo);
        ImageView imageViewFood=findViewById(R.id.ImageViewFood);

        textViewFoodTime.setText(foodModel.getFoodTime());
        textViewFoodInfo.setText(foodModel.getFoodInfo());
        imageViewFood.setImageResource(foodModel.getFoodImage());

    }
}