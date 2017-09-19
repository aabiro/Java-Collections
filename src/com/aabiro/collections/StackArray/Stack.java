package com.aabiro.collections.StackArray;

public class Stack<T> {

    //array version, memory friendly (no nodes or pointers), but not as fast because of resize
    //everything O(1) except resize O(N)


    private T[] stack;
    private int numOfItems;

    public Stack() {
        this.stack = ( T[] ) new Object[1];  // must declare as Object, because cannot give size
    }

    //O(1) if no resize
    public void push(T newData) {

        if (numOfItems == this.stack.length) {
            resize(2*this.stack.length);
        }

        this.stack[numOfItems++] = newData;
    }

    //O(1) if no resize
    public T pop() {

        T itemToPop = this.stack[--numOfItems];

        //if capacity is 25%, decrement array by half
        if (numOfItems > 0 && numOfItems == this.stack.length / 4) {
            resize(this.stack.length / 2);
        }

        return itemToPop;
    }

    //O(N) - linear
    private void resize(int capacity) {

        T[] stackCopy = ( T[] ) new Object[capacity];

        for (int i = 0; i < numOfItems; i++)
            stackCopy[i] = this.stack[i];

        this.stack = stackCopy;
    }

    public boolean isEmpty() {
        return this.numOfItems == 0;
    }

    public int size() {
       return this.numOfItems;
    }
}
