package com.aabiro.collections.Array;

public class App {

    public static void main(String[] args) {

        int[] nums = new int[5];
        //String[] strings = new String[5];

        for(int i = 1;i < nums.length; i++)
            nums[i] = i * 2;

        //O(1) random index
        int num = nums[0];
        System.out.println(num);

        //O(N) linear search --> O(logN) binary tree --> O(1) hashtable

        for(int i = 1;i < nums.length; i++)
           if (nums[i] == 4)
               System.out.println("Index found, " + i);

        //invalid index - out of range must double size and add all data to new larger array
        nums[5] = 10;

    }
}
