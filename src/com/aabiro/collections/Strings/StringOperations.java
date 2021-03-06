package com.aabiro.collections.Strings;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class StringOperations {

    public String revertString(String text) {
        //use StringBuilder --> O(N)

        int lengthOfText = text.length(); //O(1)
        StringBuilder reversedString = new StringBuilder();

        for ( int index = lengthOfText -1; index >=0; index --) { //O(N)
            reversedString.append(text.charAt(index));  //O(1) - append is a concatenation, so use StringBuilder
        }
        return reversedString.toString();
    }


    //O(N)
    public List<String> getPrefixes(String text){

        int lengthOfText = text.length();
        List<String> prefixList = new ArrayList<>();

        for (int index = 1 ; index < lengthOfText;index++){
            prefixList.add(text.substring(0, index));//O(1)
        }
        return prefixList;
    }


    public List<String> getSuffixes(String text) {
        int lengthOfText = text.length();
        List<String> suffixesList = new ArrayList<>();

        for (int index = 0; index <lengthOfText; index++) {
            suffixesList.add(text.substring(index, lengthOfText)); //O(1) for String class, StringBuilder not better for substring
        }

        return suffixesList;

    }

    //O(N) linear time complexity
    public String longestCommonPrefix(String text1, String text2 ){

        int commonLength = Math.min(text1.length(), text2.length());

        for (int index = 0; index < commonLength; ++index){
            if(text1.charAt(index) != text2.charAt(index)){
                return text1.substring(0, index); //O(1)
            }
        }
        return text1.substring(0, commonLength);

    }

    public String longestRepeatedSubstring(String text){

        int lengthOfText = text.length();
        List<String> suffixes = getSuffixes(text);

        Collections.sort(suffixes);  //uses merge sort O(NlogN)

        String longestSubstring = "";

        for (int i = 0; i < lengthOfText-1; i++){

            String tempString = longestCommonPrefix(suffixes.get(i), suffixes.get(i+1)); //use i+1 so I don's get Out Of Bounds Ex

            if (tempString.length() > longestSubstring.length()){
                longestSubstring = tempString;
            }
        }
        return longestSubstring;
    }
}
