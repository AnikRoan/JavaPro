package com.roananik.lessons03;

public class NodeTest {
    public static void main(String[] args) {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);


        List newNext;
        List prev = null;
        List current = head;

        while (current != null) {
            newNext = head.next;
            head.next = prev;
            prev = head;
            head = newNext;

        }


    }
}

class List {
    int data;
    List next;

    public List(int data) {
        this.data = data;
    }
}
