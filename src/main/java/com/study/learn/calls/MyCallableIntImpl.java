package com.study.learn.calls;

import com.study.learn.sequence.Seq;
import com.study.learn.sequence.Sequence;
import com.study.learn.threads.MyThread;

public class MyCallableIntImpl implements MyCallableInt{
    @Override
    public Integer call() throws Exception {

       // MyThread.sleep(1000);
        System.out.println(123);
        return 2;
    }
}
