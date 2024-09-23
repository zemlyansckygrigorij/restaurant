package com.study.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStream {
    public static void main(String [] args){
       // int [] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int [] nums = new int[]{};
        System.out.println("sum - "+Arrays.stream(nums).sum());
        System.out.println("max() - "+Arrays.stream(nums).max());
        System.out.println("min - "+Arrays.stream(nums).min());
        System.out.println("findAny - "+Arrays.stream(nums).findAny());
        System.out.println("average - "+Arrays.stream(nums).average());
    }
}
