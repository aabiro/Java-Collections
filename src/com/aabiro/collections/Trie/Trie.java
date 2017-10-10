package com.aabiro.collections.Trie;

import java.util.List;
import java.util.ArrayList;

public class Trie {

    private Node root;
    private int indexOfSingleChild;

    public Trie() {
        this.root = new Node("");
    }

    public void insert(String key) {

        Node tempNode = root;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);
            int ascii = (int) c;
            int asciiIndex = c - 'a'; //generate array index according to ascii values

            if(tempNode.getChild(asciiIndex) == null) {
                Node node = new Node(String.valueOf(c));
                //tempNode.setChild(asciiIndex, node, value);
                tempNode.setChild(asciiIndex, node);
                tempNode = node;
            } else {//there is already a node with the character present
                tempNode = tempNode.getChild(asciiIndex);
            }
        }
        tempNode.setLeaf(true); //set last given node as a leaf node
    }

    //O(length of key)
    public boolean search(String key) {

        Node trieNode = root;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);
            int asciiIndex = c - 'a';

            if( trieNode.getChild(asciiIndex) == null) {
                return false;
            } else {
                trieNode = trieNode.getChild(asciiIndex);
            }
        }
        //implement if substrings not allowed
        //if(trieNode.isLeaf()) return false;

        return true;
    }

    public Integer searchAsMap(String key) {

        Node trieNode = root;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);
            int asciiIndex = c - 'a';

            if( trieNode.getChild(asciiIndex) != null) {
                trieNode = trieNode.getChild(asciiIndex);
            } else {
                return null;
            }
        }
        return trieNode.getValue();
    }

    public List<String> allWordsWithPrefix(String prefix) {

        Node trieNode = root;
        List<String> allWords = new ArrayList<>();

        for (int i = 0; i < prefix.length(); i++) {

            char c = prefix.charAt(i);
            int asciiIndex = c - 'a';
            trieNode = trieNode.getChild(asciiIndex);
        }

        collect(trieNode, prefix, allWords);
        return allWords;
    }

    //longest common prefix for networking --not showing!!
    public String longestCommonPrefix() {

        Node trieNode = root;
        String lcp = "";

        System.out.println("headed in");
        while ( countNumOfChildren(trieNode) == 1 && !trieNode.isLeaf() ) {
            trieNode = trieNode.getChild(indexOfSingleChild);
            lcp = lcp + String.valueOf((char) (indexOfSingleChild + 'a'));
            System.out.println("inside");
        }
        return lcp;
    }

    private int countNumOfChildren(Node trieNode) {

        int numOfChildren = 0;

        for (int i = 0; i < trieNode.getChildren().length; i++) {
            if(trieNode.getChild(i) != null ) {
                numOfChildren++;
                indexOfSingleChild = i;
            }
        }

        return numOfChildren;
    }

    private void collect(Node node, String prefix, List<String> allWords) {

        if ( node == null) return;

        if (node.isLeaf()) {
            allWords.add(prefix);
        }

        for (Node childNode : node.getChildren()) {
            if (childNode == null) continue;
            String childCharacter = childNode.getCharacter();
            collect(childNode, prefix + childCharacter, allWords);
        }

    }
}
