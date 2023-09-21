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
        Orderable o = new Order(customerName);
        o.setNumberOrder(nextOrder++);
        lineOfCustomers.add(o);
        System.out.println(" new order arrived " + o);

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

        for (Orderable o : lineOfCustomers) {
            if (o.getNumberOrder() == index) {
                System.out.println("order view for " + o);
            }
        }

        lineOfCustomers.removeIf(i -> i.getNumberOrder() == index);

    }

    @Override
    public void draw() {
        if (lineOfCustomers.isEmpty()) {
            System.out.println("no orders");
        }

        System.out.println("**************");
        System.out.println("NUM   | NAME");
        PriorityQueue<Orderable> tempQueue = new PriorityQueue<>(lineOfCustomers);

        while (!tempQueue.isEmpty()) {
            Orderable o = tempQueue.poll();
            System.out.println(o.getNumberOrder() + "\t\t" + o.getName());
        }

        System.out.println("**************");

    }


}
