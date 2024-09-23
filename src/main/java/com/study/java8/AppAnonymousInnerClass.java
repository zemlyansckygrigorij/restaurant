package com.study.java8;

//java 9 introduced a new feature that allows us to use diamond operator with anonymous classes.
abstract class ABCD<T>{
	abstract T show(T a, T b);
}

public class AppAnonymousInnerClass {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
	        String show(String a, String b) {
               	return a+b;
            }
	    };
       	String result = a.show("Java","9");
        	System.out.println(result);
        }

}
