package com.stream;

import com.beans.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupingDemo1 {

    public static void main(String[] args) {
        System.out.println("-------------Product Based on Category-----------------------");
        Stream<Product> products = Product.getProducts();
        Map<String, List<Product>> productMap = products.collect(Collectors.groupingBy(p -> p.getCategory()));

        productMap.forEach((x,y) ->{
            System.out.println();
            System.out.print(x +"- " );
            y.forEach(b -> System.out.print( "["+b.toString()+"]"));
        });

        System.out.println();
        System.out.println("-------------Product Price Greater than 5000-----------------------");

        Stream<Product> products2 = Product.getProducts();
        Map<Boolean, List<Product>> productMap2 = products2.sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.partitioningBy(p -> p.getPrice() >=5000));

        productMap2.forEach((x,y) ->{
            if(x) {
                y.forEach(b -> System.out.println(b.getName() +" - "+ b.getPrice()));
            }
        });
    }
}
