package com.stream;

import java.util.ArrayList;
import java.util.Optional;

public class StreamReductionDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> arylist = new ArrayList<Integer>();
        arylist.add(20);
        arylist.add(40);
        arylist.add(60);
        arylist.add(80);

        Optional fir = arylist.stream().findFirst();
        Optional any = arylist.stream().findAny();
        Optional max = arylist.stream().max(Integer::compare);
        Optional min = arylist.stream().min(Integer::compare);
        long telements = arylist.stream().count();

        System.out.println("any-> " + any.get());
        System.out.println("fir-> " + fir.get());
        System.out.println("min-> " + min.get());
        System.out.println("max-> " + max.get());
        System.out.println("Totel elements-> " + telements);
    }
}
