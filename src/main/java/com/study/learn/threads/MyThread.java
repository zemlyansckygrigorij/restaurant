package com.study.learn.threads;

import com.study.learn.sequence.Seq;

public class MyThread extends Thread{
    private boolean alive = true ;
    private String name;
    private Seq un ;
    private ThreadGroup group;
    public MyThread(ThreadGroup group, String name,Seq un){
        super(group, name);
        this.name = name;
        this.un = un;
        this.group =group;
    }
    public MyThread( String name,Seq un){
        this.name = name;
        this.un = un;
    }

    @Override
    public void run() {
        for(int i =0;i<10;i++){
            if(alive) {
                try {
                    sleep(100L);
                } catch (InterruptedException e) {
                }
                System.out.println(name + " - "+group.getName()+"-" + un.getNext());
            }
        }
    }
    public  void interrupt(){
        alive = false;
    }
    public boolean isInterrupted(){
        return alive;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }
}
