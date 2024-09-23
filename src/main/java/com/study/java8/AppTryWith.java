package com.study.java8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class AppTryWith {
    public static void main(String [] args) throws FileNotFoundException {
        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");
        try(fileStream){//only in java 9 data from out
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
