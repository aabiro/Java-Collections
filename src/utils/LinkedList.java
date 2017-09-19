package utils;

import java.util.List;
//Java includes this as a Doubly LinkedList implementation!

public class LinkedList {

    public static void main(String[] args) {

        List<Integer> list = new java.util.LinkedList<>();

        //added to end of list
        list.add(3);
        list.add(10);
        list.add(33);
        list.add(44);

        list.remove(0); //very fast, why we like (doubly) linked lists!!


        for(Integer i : list) {
            System.out.println(i);
        }

        System.out.println( list.get(1) ); //not that fast
        System.out.println( list.isEmpty() );
    }
}
