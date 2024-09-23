package com.study.learn.timers;

import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class MyTimerTask extends TimerTask {
    String name;
    public MyTimerTask(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i =0; i<100;i++){
            System.out.println("MyTimerTask -"+name+"-"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //Thread.currentThread().
        }
    }
}
