package com.aabiro.collections.HakerRank;
import java.util.Scanner;
import java.util.ArrayList;

public class StdIn {

    static int[] oddNumbers(int l, int r) {
        ArrayList <Integer> res = new ArrayList <>();

        for (int i = l; i <= r; i++) {
            if (i % 2 == 1) {
                res.add(i);
            }
        }
        int res2[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            res2[i] = res.get (i);
        }
        return res2;
    }

    static String findNumber(int[] arr, int k) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {//for reading array
            arr[i] = s.nextInt();
        }

        k = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                return "YES";
            }

        }

        return "NO";


    }
}