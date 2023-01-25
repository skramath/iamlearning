package com.lambdas;


import java.util.function.Predicate;

public class PredicateExample {

    boolean isNumeric(String number){
        try{
            Integer.parseInt(number.toString());
        }catch (Exception exe){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Predicate<String> p = new PredicateExample()::isNumeric;
        System.out.println(p.test("1000"));
        System.out.println(p.test("123E"));
        System.out.println(p.test("123"));
        System.out.println(p.test("A123E"));
    }
}
