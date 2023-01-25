package com.lambdas;

@FunctionalInterface
interface MethodInterface{
    void saySomething(String name);
}

public class MethodReference1 {

    public static void getInfo(String info) {
        System.out.println("Calling from MR"+info);
    }

    public static void main(String[] args) {

        MethodInterface interf1 = (String s) -> System.out.println("Calling from Lambda :"+s);

        MethodInterface interf2 = MethodReference1::getInfo;

        interf1.saySomething("How are you");
        interf2.saySomething("How are you");
    }
}
