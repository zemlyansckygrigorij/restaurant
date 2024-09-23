package com.study.java8;

import java.util.StringJoiner;
import java.util.function.BiConsumer;

public class AppStringJoiner {
    public static void main(String[] args){
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");
        joinNames.add(" ");

        System.out.println(joinNames);
        System.out.println(joinNames.toString());
        joinNames.setEmptyValue("567");
        System.out.println(joinNames.toString());
    }
}
