package com.study.java8;

import java.util.Arrays;
//New methods has added to java.util.Arrays package
// that use the JSR 166 Fork/Join parallelism common pool to provide sorting of arrays in parallel.
public class AppParallelArraySorting {
    public static void main(String [] args){
        // Creating an integer array
        int[] arr = {5,8,1,0,6,9};
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        // Sorting array elements parallel
   //     Arrays.parallelSort(arr);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
