package com.aabiro.collections.BoyerMoore;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {

    private String text;
    private String pattern;
    private Map<Character, Integer> mismatchShiftTable;

    public BoyerMoore(String text, String pattern){
        this.text = text;
        this.pattern = pattern;
        this.mismatchShiftTable = new HashMap<>();
    }

    //construct the bad match table
    public void precomputeShift(){

        int lengthOfPattern = this.pattern.length();

        for(int index = 0; index < lengthOfPattern; index++) {
            char actualCharacter = this.pattern.charAt(index);
            int maxShift = Math.max(1, lengthOfPattern-index-1);
            this.mismatchShiftTable.put(actualCharacter, maxShift);
        }
    }

    //concrete BM algorithm worst case O(n+m), but usually sub linear
    public int search() {

        int lengthOfPattern = this.pattern.length();
        int lengthOfText = this.text.length();
        int numOfSkips;

        for (int i = 0; i <= lengthOfText - lengthOfPattern; i+= numOfSkips) { //i skips to numOfSkips

            numOfSkips = 0;

            //iterate through pattern in reverse order
            for (int j = lengthOfPattern - 1; j >=0; j--){
                if ( pattern.charAt(j) != text.charAt(j+i)) {
                    if( this.mismatchShiftTable.get(text.charAt(i+j)) != null) {
                        //the letter has been found
                        numOfSkips = this.mismatchShiftTable.get(text.charAt(i+j));
                        break;
                    } else {
                        numOfSkips = lengthOfPattern;
                        break;
                    }
                }
            }

            if (numOfSkips == 0) return i; //a match has been found, return the index
        }
        return lengthOfText; //no match found
    }

}
