package com.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Product {

    Integer id;
    String name;
    String Category;
    Double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(Integer id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        Category = category;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        Category = category;

    }


    public static Stream<Product> getProducts(){
       List<Product> products = new ArrayList<>();
       products.add(new Product(40, "Mobile", "Electronic Items", 123445.0));
       products.add(new Product(23, "TV", "Electronic Items", 360000.00));
       products.add(new Product(43, "Computer", "Electronic Items", 100000.00));
       products.add(new Product(34, "Rice", "Food Item", 340.0));
       products.add(new Product(50,"Wheat", "Food Item", 180.0));
        products.add(new Product(134, "Chair", "Furniture", 5340.0));
        products.add(new Product(150,"Bed", "Furniture", 180.0));

        return products.stream();

    }

}
