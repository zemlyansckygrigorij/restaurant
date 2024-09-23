package com.study.learn.apps;

import com.study.learn.sequence.Seq;
import com.study.learn.sequence.Sequence;
import com.study.learn.threads.MyThread;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;


public class Application {
    public static void main(String [] args){
        ThreadGroup group1 = new ThreadGroup("group1");
        ThreadGroup group2 = new ThreadGroup("group2");
        Seq un = new Sequence();
        MyThread thread1 = new MyThread(group1,"thread1",un);
        MyThread thread2 = new MyThread(group2,"thread2",un);

        List<MyThread> threads = new ArrayList<>();

        threads.add(thread1);
        threads.add(thread2);

        threads.stream().filter(t->t.getThreadGroup().getName().equals("group2")).forEach(t->{
            t.start();
            try {
                t.join();
                sleep(300L);
                t.interrupt();
                sleep(300L);
                t.setAlive(true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
