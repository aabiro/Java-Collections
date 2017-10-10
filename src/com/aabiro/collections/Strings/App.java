package com.aabiro.collections.Strings;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StringOperations operations = new StringOperations();

        System.out.println(operations.revertString("Hello World!"));
        //palindrome
        System.out.println(operations.revertString("RacecaR"));

        List<String> suffixes = operations.getSuffixes("Hello!");

        System.out.println(suffixes);

        for (String s: suffixes)
            System.out.println(s);

        System.out.println(suffixes.size()); //will store this many suffixes

        List<String> prefixes = operations.getPrefixes("House");
        System.out.println(prefixes);
        System.out.println(operations.longestCommonPrefix("Hello", "Helooc"));

        System.out.println(operations.longestRepeatedSubstring("hellohhehehello"));


    }
}
