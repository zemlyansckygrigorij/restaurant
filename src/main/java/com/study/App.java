package com.study;

import com.study.learn.threads.MyThread;
import com.study.learn.sequence.UnSafeSequence;

public class App {
    public static void main(String[] args){
      //  System.out.println("Helloworld");
      //  Menu tea = Menu.TEA;
     //   System.out.println(tea.getTimeCooking());
     //   System.out.println(tea.getTimeEating());

        UnSafeSequence un = new UnSafeSequence();
     //   Sequence seq = new Sequence();
        for(int i =0;i<10;i++){
            MyThread thread = new MyThread("thread"+i, un);
            thread.start();
            try{
              thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
