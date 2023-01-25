package com.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleWithMethodReference {

    ExampleWithMethodReference(){
        System.out.println("ExampleWithMethodReference Called without argument");
    }

    ExampleWithMethodReference(String name){
        System.out.println("ExampleWithMethodReference Called ->"+name);
    }

    static String show(){
        return "Hello from ExampleWithMethodReference";
    }

    Integer print(Integer i){
        return i*100;
    }

    public static void main(String[] args) {
        // Reference to the static method
        Supplier supplier = ExampleWithMethodReference::show;
        System.out.println(supplier.get());

        //Reference to instance method from an instance
        ExampleWithMethodReference ref = new ExampleWithMethodReference();
        Function<Integer, Integer> function = ref::print;
        System.out.println(function.apply(100));

        //Reference to constructor
        Consumer<String> consumer = ExampleWithMethodReference::new;
        consumer.accept("MY_NAME");

    }




}
