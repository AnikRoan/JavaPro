package com.roananik.lessons09.coffee.order;

import java.util.*;

public class CoffeeOrderBoard implements OrderBoard {
    private static CoffeeOrderBoard coffeeBoard;
    private Queue<Orderable> lineOfCustomers;
    private int nextOrder;

    private CoffeeOrderBoard() {
        this.lineOfCustomers = new PriorityQueue<>();
        this.nextOrder = 1;
    }

    public static CoffeeOrderBoard getCoffeeBoard() {
        if (coffeeBoard == null) {
            coffeeBoard = new CoffeeOrderBoard();
        }
        return coffeeBoard;
    }


    @Override
    public void addOrder(String customerName) {
        if (customerName.isEmpty()) {
            return;
        }
        Orderable customerData = new Order(customerName);
        customerData.setNumberOrder(nextOrder++);
        lineOfCustomers.add(customerData);
        System.out.println("new order arrived " + customerData);

    }

    @Override
    public void deliver() {
        if (lineOfCustomers.isEmpty()) {
            System.out.println("no orders");
            return;
        }

        System.out.println("order view for " + lineOfCustomers.poll());

    }

    @Override
    public void deliver(int index) {
        if (lineOfCustomers.isEmpty()) {
            System.out.println("no orders");
            return;
        }

        for (Orderable customer : lineOfCustomers) {
            if (customer.getNumberOrder() == index) {
                System.out.println("order view for " + customer);

            }
        }

        lineOfCustomers.removeIf(customerNumber -> customerNumber.getNumberOrder() == index);

    }

    @Override
    public void draw() {
        if (lineOfCustomers.isEmpty()) {
            System.out.println("no orders");
        }

        System.out.println("**************");
        System.out.println("NUM   | NAME");
        PriorityQueue<Orderable> temp = new PriorityQueue<>(lineOfCustomers);

        while (!temp.isEmpty()) {
            Orderable customer = temp.poll();
            System.out.println(customer.getNumberOrder() + "\t\t" + customer.getName());
        }

        System.out.println("**************");

    }


}
