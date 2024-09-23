package com.study.entity;

import java.util.List;

public class Order {
    Client client;
    private List<Menu> foods;

    public Order(List<Menu> foods){
        this.foods = foods;
    }

    public List<Menu> getFoods(){
        return foods;
    }
    public void setFoods(List<Menu> foods){
        this.foods = foods;
    }
}
