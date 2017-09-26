package com.aabiro.collections.Trie;

public class App {
    public static void main(String[] args) {

        Trie trie = new Trie();

        //for trie as map
//        trie.insert("joe", 1);
//        trie.insert("joell", 2);
//        trie.insert("adam", 20);
//        trie.insert("adam", 20);
//        trie.insert("adada", 20);
//        trie.insert("adaa", 20);
//        trie.insert("adaazzz", 20);


        trie.insert("joel");
        trie.insert("adamovich");
        trie.insert("aaryn");
        trie.insert("adazz");
        trie.insert("adazere");

//        System.out.println(trie.search("joee"));
//        System.out.println(trie.search("joell"));
//        System.out.println(trie.search("aaryn"));
//        System.out.println(trie.search("adazz"));
//        System.out.println(trie.search("adamovic"));

        //hash tables can have the integer as a value parameter, but always use the string key
//        System.out.println(trie.searchAsMap("joe"));
//        System.out.println(trie.searchAsMap("joell"));
//        System.out.println(trie.searchAsMap("adam"));

        System.out.println( trie.allWordsWithPrefix("ada"));
        System.out.println( trie.allWordsWithPrefix(""));//DFS with search (Sorting feature)

        System.out.println();
        System.out.println(trie.longestCommonPrefix());

    }
}
