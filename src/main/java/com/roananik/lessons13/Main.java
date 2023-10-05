package com.roananik.lessons13;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
        System.out.println("enter the book title");
        String bookTitle=scanner.nextLine();
        System.out.println("enter the number. hom many unique words do you want to get");
        int count= scanner.nextInt();

        BookAnalize bookAnalize = new BookAnalize(bookTitle,count);
        bookAnalize.run();

    }
}
