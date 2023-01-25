package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapDemo1 {

    static List<Integer> printSquareOfEvenNumber(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 == 0).map(n-> n*n).collect(Collectors.toList());
    }

    static List<Integer> printSortedSquareOfEvenNumber(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 == 0).map(n-> n*n).sorted().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,2,3,4,5,35,123,45,12,5);
        System.out.println("Input Numbers -"+numbers);
        Function<List<Integer>, List<Integer>> evenNumber = StreamFilterDemo1::printEvenNumber;
        Function<List<Integer>, List<Integer>> squareEvenNumber = StreamMapDemo1::printSquareOfEvenNumber;
        Function<List<Integer>, List<Integer>> sortedSquareEvenNumber = StreamMapDemo1::printSortedSquareOfEvenNumber;
        System.out.println("Numbers which are Even -"+evenNumber.apply(numbers));
        System.out.println("Squared Even Number -"+squareEvenNumber.apply(evenNumber.apply(numbers)));
        System.out.println("Squared Even Number in Sorted Order -"+sortedSquareEvenNumber.apply(evenNumber.apply(numbers)));
    }
}
