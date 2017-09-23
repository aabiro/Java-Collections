package com.aabiro.collections.HashMapChaining;

public class HashTable {

    //HashMap's table - an underlying array structure - this is how it can be O(1) lookup etc

    private HashItem[] hashTable;

    public HashTable() {
        hashTable = new HashItem[Constants.TABLE_SIZE];
    }

    public int get(int key) {

        int generatedArrayIndex = hash(key);

        if (hashTable[generatedArrayIndex] == null) {
            //search miss
            return -1;
        } else {
            HashItem hashItem = hashTable[generatedArrayIndex];

            //look through Linked List if there was collision
            while (hashItem != null && hashItem.getKey() != key) {
                hashItem = hashItem.getNextHashItem();
            }

            if (hashItem == null) {
                return -1;
            } else {
                return hashItem.getValue();
            }
        }
    }

    public void put(int key, int value) {

        int hashArrayIndex = hash(key);

        if (hashTable[hashArrayIndex] == null) {
            System.out.println("No collision simple insertion...");
            hashTable[hashArrayIndex] = new HashItem(key, value);
        } else {

            //there is a collision, insert new HashItem into this array bucket as LinkedList
            System.out.println("Collision when inserting with key" + key);
            HashItem hashItem = hashTable[hashArrayIndex];

            while (hashItem.getNextHashItem() != null) {
                hashItem = hashItem.getNextHashItem();
                System.out.println("Considering the next item in Linled List " + hashItem.getValue());

            }
            System.out.println("Finally we have found the place to insert...");
            hashItem.setNextHashItem(new HashItem(key, value));
        }
    }

    private int hash(int key) {
        return key % Constants.TABLE_SIZE;
        //test to make collisions
        //return 1;
    }

}
