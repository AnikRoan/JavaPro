package com.roananik.lessons09.coffee.order;

public class Order implements Comparable<Order>, Orderable {
    private final String name;
    private int numberOrder;


    public Order(String customerName) {
        this.name = customerName;

    }


    @Override
    public String toString() {
        return "name: " + name +
                ", number: " + numberOrder + '\n';
    }


    @Override
    public int compareTo(Order o) {
        return this.numberOrder - o.numberOrder;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOrder() {
        return numberOrder;
    }

    @Override
    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }
}
