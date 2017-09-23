package com.aabiro.collections.HashMapChaining;

public class App {

    public static void main(String[] args) {


        HashTable hashTable = new HashTable();

        hashTable.put(1, 10);
        System.out.println();
        hashTable.put(2, 100);
        System.out.println();
        hashTable.put(3, 1000);
        System.out.println();
        hashTable.put(4, 10000);
        hashTable.put(5, 10000);
        hashTable.put(6, 10000);
        hashTable.put(7, 10000);
        hashTable.put(8, 10000);
        hashTable.put(9, 10000);
        hashTable.put(10, 10000);
        hashTable.put(11, 10000);
        hashTable.put(12, 10000);


        System.out.println(hashTable.get(1));
        System.out.println(hashTable.get(2));
        System.out.println(hashTable.get(3));
        System.out.println(hashTable.get(4));

    }
}
