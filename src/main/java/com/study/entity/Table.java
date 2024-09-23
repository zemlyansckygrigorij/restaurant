package com.study.entity;

public class Table {
    private boolean blocked = false;
    public boolean isBlocked(){
        return blocked;
    }
    synchronized public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }
}
