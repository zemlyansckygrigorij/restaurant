package com.study.entity;

import java.util.Random;

public enum Menu {
    SOUP(10,20),
    NOODLES(10,20),
    ROASTED_CHICKEN(10,20),
    PORRIDGE(10,20),
    BREAD(10,20),
    TEA(10,20),
    COFFEE(10,20);

    private int timeCooking;
    private int timeEating;
    private static final Random PRNG = new Random();

    Menu(int timeCooking, int timeEating) {
        this.timeCooking= timeCooking;
        this.timeEating = timeEating;
    }
    public int getTimeCooking(){
        return timeCooking;
    }
    public int getTimeEating(){
       return timeEating;
    }
    public static Menu getRandomMenu(){
        Menu[] menues = Menu.values();
        return menues[PRNG.nextInt(menues.length)];
    }
}
