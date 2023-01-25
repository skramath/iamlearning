package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo2 {

    //https://quescol.com/interview-preparation/java-8-coding-interview-question

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,6,7,8,9,10,11);
        findCubesAndFilter(numbers);
    }

    //program to perfrom cube on list elements and filter numbers greater than 50.
    public static void findCubesAndFilter(List<Integer> numbers){
        numbers.stream().map( n -> n*n*n).filter(n-> n>0).forEach(System.out::println);
    }

    // program to get the sum of all numbers present in a list?
    public static void sum(List<Integer> numbers){
        Integer sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum - "+sum);

    }

    //program to Print Strings whose length is greater than 3 in List.


}
