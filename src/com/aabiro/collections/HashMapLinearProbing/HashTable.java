package com.aabiro.collections.HashMapLinearProbing;

public class HashTable {

    private  HashItem[] hashTable;

    public HashTable() {
        this.hashTable = new HashItem[Constants.TABLE_SIZE];
    }

    public int get(int key) {
        int generatedIndex = hashFunction(key);

        while (hashTable[generatedIndex] != null && hashTable[generatedIndex].getKey() != key) {
            generatedIndex = (generatedIndex + 1) % Constants.TABLE_SIZE;
            System.out.println("Hopping to next index: " + generatedIndex);
        }

        if (hashTable[generatedIndex] == null) {
            //did not find
            return -1;
        } else {
            return hashTable[generatedIndex].getValue();
        }
    }

    public void put(int key, int value) {
        int generatedIndex = hashFunction(key);
        System.out.println("Put method called with value: " + value + ". Generated index: " + generatedIndex);

        //there is a collision, move forward
        while (hashTable[generatedIndex] != null) {
            System.out.println("Collision -> next index: " + (generatedIndex + 1));
            generatedIndex = (generatedIndex + 1) % Constants.TABLE_SIZE;

        }
        System.out.println("Inserted finally with index: " + generatedIndex);
        hashTable[generatedIndex] = new HashItem(key, value);
    }

    private int hashFunction(int key) {
        return key % Constants.TABLE_SIZE;
    }
}
