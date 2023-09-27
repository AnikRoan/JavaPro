package com.roananik.lessons11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product>products = new ArrayList<>(Arrays.asList(
                new Product("Book",300.40,true,LocalDate.of(2023,4,11)),
                new Product("Book",280.30,false,LocalDate.of(2023,3,21)),
                new Product("Book",330.40,true,LocalDate.of(2023,8,1)),
                new Product("Map",100.40,false,LocalDate.of(2023,6,12)),
                new Product("Cap",30.10,false,LocalDate.of(2022,10,11)),
                new Product("Book",50.80,true,LocalDate.of(2023,7,30)),
                new Product("Book",29.40,true,LocalDate.of(2023,12,17)),
                new Product("Book",66.40,true,LocalDate.of(2023,9,5)),
                new Product("Book",71.40,true,LocalDate.of(2023,9,10))
        ));

//List<Product>p = Product.getAllAbovePrise(products,"Book",250);
//        System.out.println(p);

List<Product>p=Product.getDiscount(products,"Book",10);
        System.out.println(p);




    }
}
