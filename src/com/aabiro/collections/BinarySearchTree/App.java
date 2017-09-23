package com.aabiro.collections.BinarySearchTree;

public class App {

    public static void main(String[] args) {

        Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(-1);
        bst.insert(1);
        bst.insert(0);
        bst.insert(1000);
        bst.insert(-22);


        System.out.println(bst.getMaxValue());
        System.out.println(bst.getMinValue());


        System.out.println();
        System.out.println();

        bst.traversal();

        bst.delete(10);

        System.out.println();
        System.out.println();
        bst.traversal();

        System.out.println();
        System.out.println();

        bst.delete(-22);

        Tree<String> strBst = new BinarySearchTree<>();

        strBst.insert("Adam");
        strBst.insert("Aaryn");
        strBst.insert("Colin");
        strBst.insert("Leah");
        strBst.insert("James");

        //gives alphabetical ordering
        strBst.traversal();


        System.out.println();
        System.out.println();

        ///////////////////////////////
        //with Object

        Tree<Person> personBst = new BinarySearchTree<>();

        personBst.insert( new Person ("Aaryn", 27));
        personBst.insert( new Person ("Adam", 27));
        personBst.insert( new Person ("Colin", 28));
        personBst.insert( new Person ("Jack", 21));
        personBst.insert( new Person ("Homer", 30));

        personBst.traversal();





    }


}
