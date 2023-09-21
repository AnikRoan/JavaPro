package com.roananik.lessons09.coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderList = CoffeeOrderBoard.getCoffeeBoard();

        orderList.addOrder("Masha");
        orderList.addOrder("Kolia");
        orderList.addOrder("Ivan");
        orderList.addOrder("Olga");
        orderList.addOrder("Sveta");
        orderList.addOrder("Galina");

        orderList.draw();
        orderList.deliver(2);

        orderList.draw();
        orderList.addOrder("Chuka");
        orderList.draw();

        orderList.deliver();
        orderList.draw();

        orderList.deliver(4);
        orderList.deliver(3);
        orderList.draw();

        CoffeeOrderBoard secondOrderList = CoffeeOrderBoard.getCoffeeBoard();
        secondOrderList.addOrder("Fakir");
        secondOrderList.draw();



    }


}
