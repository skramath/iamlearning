package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo1 {
    public static void main(String[] args) {

        Stream<String> ar1 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        HashSet<String> set1 =  ar1.collect(Collectors.toCollection(HashSet::new));
        set1.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        Stream<String> ar2 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        Set<String> set2 =  ar2.collect(Collectors.toSet());
        set2.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        Stream<String> ar3 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        ArrayList<String> arrayList1 =  ar3.collect(Collectors.toCollection(ArrayList::new));
        arrayList1.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        Stream<String> ar4 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        List<String> arrayList2 =  ar4.collect(Collectors.toList());
        arrayList2.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        Stream<String> ar5 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        List<String> linkedList1 =  ar5.collect(Collectors.toCollection(LinkedList::new));
        linkedList1.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        Stream<String> stream1 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        String joinedStr1 =  stream1.map(a -> a.toString()).collect(Collectors.joining("-"));
        System.out.println(joinedStr1);

        System.out.println("-----------------------------------");

        Stream<String> stream2 = Stream.of(new String[]{"qwqwe3fsf34fsf5sdf", "345345dsdfff", "456564ffff"});
        String joinedStr2 =  stream2.map(a -> a.toString()).collect(Collectors.joining(",","<",">"));
        System.out.println(joinedStr2);



    }
}
