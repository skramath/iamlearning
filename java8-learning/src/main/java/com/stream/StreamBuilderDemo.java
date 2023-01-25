package com.stream;

import java.util.stream.Stream;

public class StreamBuilderDemo {

    public static void main(String[] args) {
        Stream stream1 = Stream.empty();
        System.out.println("Size of Stream 1 - "+stream1.count());

        Stream stream2 = Stream.builder().add("Sarath").add("Sitara").add("Devna").build();
        //System.out.println("Size of Stream 2 - "+stream2.count());
        stream2.forEach(System.out::println);
    }
}
