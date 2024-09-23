package com.study.learn.apps;

import com.study.learn.calls.MyCallableIntImpl;

public class AppCall {
    public static void main(String[] args) throws Exception {
        MyCallableIntImpl myCall = new MyCallableIntImpl();
        try{
            System.out.println("time-"+myCall.call());
        }catch(Exception e ){}

    }
}
