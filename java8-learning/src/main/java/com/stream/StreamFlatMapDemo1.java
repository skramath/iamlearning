package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFlatMapDemo1 {

    static Stream<Integer> getNumericList(String str){
        ArrayList<Integer> ar1 =new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                ar1.add(Character.getNumericValue(str.charAt(i)));
            }
        }
        return ar1.stream();
    }

    public static void main(String[] args) {
        ArrayList<String> ar1 =new ArrayList<>();
        ar1.add("qwqwe3fsf34fsf5sdf");
        ar1.add("sdf5ggg3sfg4sdfsdf");
        ar1.add("asdf6df1sdf7sdsfed");

        System.out.println("Result From Map - ");
        Stream<Stream<Integer>> str1 = ar1.stream().map( e -> getNumericList(e));
        str1.forEach(e -> e.forEach(a -> System.out.print(a+",")));

        System.out.println();

        System.out.println("Result From FlatMap - ");
        Stream<Integer> str2 = ar1.stream().flatMap( e -> getNumericList(e));
        str2.forEach( a -> System.out.print(a+","));




    }
}
