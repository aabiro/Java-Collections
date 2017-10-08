package com.aabiro.collections.BruteForceStringSerach;

public class App {

    public static void main(String[] args) {
        String text = "My name is Jonas";
        String pattern = "name";



        System.out.println(search(text, pattern)); //index where there is a match

    }

    public static int search(String text, String pattern) {
        //need to match PATTERN to TEXT string
        int lengthOfText = text.length();
        int lengthOfPattern = pattern.length();

        for( int i = 0;i < lengthOfText - lengthOfPattern; i++) {

            int j;

            for ( j = 0; j< lengthOfPattern; j++){
                if( text.charAt(i+j) != pattern.charAt(j) ){
                    break;
                }
            }
            //got through with all matches
            if ( j == lengthOfPattern ) return i; //return the index in the text where the match occurred

        }
        return lengthOfText; //return indicator that it is not found!
    }
}
