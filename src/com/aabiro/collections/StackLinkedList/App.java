package com.aabiro.collections.StackLinkedList;

public class App {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(100);
        myStack.push(1000);

        System.out.println(myStack.size());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


        Stack<String> myStringStack = new Stack<>();

        myStringStack.push("Aaryn");
        myStringStack.push("Emma");
        myStringStack.push("Henry");

        System.out.println(myStringStack.size());
        System.out.println(myStringStack.peek());

        System.out.println(myStringStack.pop());
        System.out.println(myStringStack.pop());
        System.out.println(myStringStack.pop());

    }
}
