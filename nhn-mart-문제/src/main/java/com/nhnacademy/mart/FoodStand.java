package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public Food delete(String name){
        int index = -1;
        for(int i = 0;i < foods.size();i++){
            if(foods.get(i).getName().equals(name)){
                 index = i;
                 break;
            }
        }

        return foods.get(index);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
