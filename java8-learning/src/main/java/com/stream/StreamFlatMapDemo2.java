package com.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamFlatMapDemo2 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        arr1.add(new ArrayList<Integer>(Arrays.asList(10,20,30)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(40,50,60)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(70,80,90)));

        arr1.stream().flatMap(e -> e.stream()).forEach( a -> System.out.print(a+","));
    }
}
