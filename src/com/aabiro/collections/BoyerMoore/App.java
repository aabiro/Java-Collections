package com.aabiro.collections.BoyerMoore;


//boyer more is less than linear time!
public class App {

    public static void main(String[] args) {
        String text = "My name is Joe!";
        String pattern = "aaa";

        BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
        boyerMoore.precomputeShift();
        System.out.println( boyerMoore.search() );

    }
}
