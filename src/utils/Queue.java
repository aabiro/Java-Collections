package utils;

import java.util.LinkedList;

//Queues and Stacks are ADT's, not data structures
// (their underlying data structures are arrays or linked lists)

//Queue is a Collection and Iterable
//concrete implementations are LinkedList, PriorityQueue and ArrayDeque

//FIFO

//LinkedList and PriorityQueue are methods for queue interface
//PriorityQueue stores elements according to natural order and has:
//add(), element(), remove()

//Applications --> BFS


public class Queue {

    public static void main(String[] args) {


        java.util.Queue<String> queue = new LinkedList<>();

        queue.add("Kevin");
        queue.add("Joe");
        queue.add("Adam");

        //can use for each with Collections that are Iterables, like Queues
        //FIFO
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
