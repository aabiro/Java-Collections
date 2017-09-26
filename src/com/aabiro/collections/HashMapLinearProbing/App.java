package com.aabiro.collections.HashMapLinearProbing;

public class App {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.put(1, 10);
        System.out.println();
        hashTable.put(1, 100);
        System.out.println();
        hashTable.put(1, 1000);
        System.out.println();

        System.out.println(hashTable.get(3));
    }

}
