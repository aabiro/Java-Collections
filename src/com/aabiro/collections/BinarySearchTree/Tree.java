package com.aabiro.collections.BinarySearchTree;

//this is the BST interface
public interface Tree<T> {

    public void traversal();
    public void insert(T data);
    public void delete(T data);
    public T getMaxValue();
    public T getMinValue();

}
