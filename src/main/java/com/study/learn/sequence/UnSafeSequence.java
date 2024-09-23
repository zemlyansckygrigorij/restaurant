package com.study.learn.sequence;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnSafeSequence  implements Seq{
    private int value;
    public int getNext(){
        System.out.println("value - "+value);
        return value++;
    }
}
// @ThreadSafe
//@Immutable
//@NotThreadSafe