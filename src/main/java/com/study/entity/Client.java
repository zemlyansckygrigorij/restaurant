package com.study.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    private static long countClient=0;
    private final long number;
    private final Order order;
    private Table table;
    public Client(){
        this.number = countClient++;
        this.order =createOrder();
    }
    public Order createOrder(){
        Random rand = new Random();
        int countFood = rand.nextInt(5);
        List<Menu> foods = new ArrayList<>();
        for(int i = 0; i<countFood; i++){
            foods.add(Menu.getRandomMenu());
        }

        Order order = new Order(foods);
        return order;
    }
    public void callWaiter(){}

    public int waitWaiter(){
       return order.getFoods().stream().mapToInt(Menu::getTimeCooking).sum();
    }

    public int eating(){
        return order.getFoods().stream().mapToInt(Menu::getTimeEating).sum();
    }
    
    public void getTable(Table table){
        this.table = table;
        table.setBlocked(true);
    }
    public void unBlockTable(){
        this.table = null;
        table.setBlocked(false);
    }
    public long getNumber(){return number;}
    public Order getOrder(){return order;}
}
