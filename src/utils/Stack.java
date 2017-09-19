package utils;

//import java.util.Stack;

public class Stack {

    //LIFO principle
    //push, peek, pop

    //stacks are good for some data processing, ex parsing XML file using SAX or StAX
    //Applications --> graph traversing with DFS

    public static void main(String[] args) {

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println(stack.peek());
        System.out.println(stack.size());

        for (Integer i : stack)
            System.out.println(i);

    }
}
