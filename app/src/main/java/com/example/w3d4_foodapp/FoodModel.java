package com.example.w3d4_foodapp;

import java.io.Serializable;

//TODO: 1. Data modelimizi oluşturduk

public class FoodModel implements Serializable {

    private String foodName;
    private String foodTime;
    private int foodImage;
    private String foodInfo;

    //TODO: 2. Constracture oluşturduk

    public FoodModel(String foodName, String foodTime, int foodImage, String foodInfo) {
        this.foodName = foodName;
        this.foodTime = foodTime;
        this.foodImage = foodImage;
        this.foodInfo = foodInfo;
    }

    //TODO 3. Getter ve Setter oluşturduk

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodTime() {
        return foodTime;
    }

    public void setFoodTime(String foodTime) {
        this.foodTime = foodTime;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodInfo() {
        return foodInfo;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }
}
