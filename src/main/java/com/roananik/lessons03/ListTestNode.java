package com.roananik.lessons03;

public class ListTestNode {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(4);
        head.next.next.next= new Node(7);


        Node prev = null;
        Node current = head;//(2)
        Node nextNode;


        while ((current != null)) {//2,5,4



            nextNode = head.next; //current=2, current.next = 5, nextNode=5
            current.next = prev;//current.next = null
            prev = current;//prev=2
            current = nextNode;//current=5
        }
        head = prev;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
    public static class Cl{


    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
