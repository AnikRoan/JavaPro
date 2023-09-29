package com.roananik.lessons11;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
    private final String type;
    private double prise;
    private boolean discount;
    private LocalDate ofAdding;

    public Product(String type, double prise, boolean discount, LocalDate addingProduct) {
        this.type = type;
        this.prise = prise;
        this.discount = discount;
        this.ofAdding = addingProduct;
    }

    public String getType() {
        return type;
    }

    public LocalDate getOfAdding() {
        return ofAdding;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }



    public static List<Product> getAllAbovePrise(List<Product> products, String type, double minPrise) {
        return products.stream()
                .filter(p -> p.getType().equals(type))
                .filter(p -> p.getPrise() > minPrise)
                .toList();


    }



    public static List<Product> getDiscount(List<Product> products, String type, int discountPercentage) {
        return products.stream()
                .filter(p -> p.getType().equals(type))
                .filter(p -> p.isDiscount() == true)
                .map(p -> new Product(p.getType(), p.getPrise() - (p.getPrise() * ((double) discountPercentage / 100)),
                        false, p.getOfAdding()))
                .toList();
    }


    public static Product getMinPrice(List<Product> products, String type) {
        Optional<Product> cheapProduct = products.stream()
                .filter(p -> p.getType().equals(type))
                .min(Comparator.comparingDouble(Product::getPrise));
        return cheapProduct.orElseGet(() ->
                new Product("product " + type + " not found", 0.0,
                        false, LocalDate.of(1970, 1, 1)));

    }




    public static List<Product> getNewestOne(List<Product> products, int count) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getOfAdding))
                .skip(products.size() - count)
                .toList();
    }



    public static double getTotalCostsProduct(List<Product> products, int year, String type, double maxPrice) {
        return products.stream()
                .filter(p -> p.getType().equals(type))
                .filter(p -> p.getOfAdding().getYear() == year)
                .filter(p -> p.getPrise() <= maxPrice)
                .mapToDouble(Product::getPrise)
                .sum();


    }



    public static Map<String, List<Product>> getGroupProducts(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));

    }


    @Override
    public String toString() {
        return
                "TYPE: " + type + '.' +
                        " PRICE: " + prise + '.' +
                        " addDATE: " + ofAdding + '\n';
    }
}
