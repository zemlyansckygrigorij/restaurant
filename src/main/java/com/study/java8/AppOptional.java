package com.study.java8;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface DoSome{
    void doSome();
}
public class AppOptional {
    public static void main(String[] args){
     //  String value = "hello world!";
       String value = null;
       Optional<String> opt = Optional.ofNullable(value);// can get null value
      // Optional<String> opt = Optional.of(value);//only notNull value
       // System.out.println("get-"+opt.get());
        System.out.println("isPresent-"+opt.isPresent());
        System.out.println("isEmpty-"+opt.isEmpty());

        Consumer<String> con = (s)->System.out.println("Consumer-"+s);
        opt.ifPresent(con);
        Supplier<Optional<String>> supl = ()->Optional.of("Supplier-");
        System.out.println(opt.or(supl).get());

        Predicate<String> pred = (s)->s==null;

        System.out.println("opt.filter-"+opt.filter(pred));
     //   System.out.println("opt.orElseThrow()-"+opt.orElseThrow());//if nulljava.util.NoSuchElementException: No value present
     //   opt.orElseThrow(()->new RuntimeException("RuntimeException"));
        opt.ifPresent(con);
        opt.ifPresentOrElse(
                (v)
                        -> { System.out.println(
                        "Value is present, its: "
                                + v); },
                ()
                        -> { System.out.println(
                        "Value is empty"); });

    }
}
