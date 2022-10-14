package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */


    public static void main(String[] args) {
        String word1 = "CAT";
        String word2 = "ACT";

        char[] ch1 = word1.toCharArray();// converting string to characters array
        char[] ch2 = word2.toCharArray();// converting string to characters array

        Arrays.sort(ch1); // sorting characters array
        Arrays.sort(ch2); // sorting characters array

        boolean isAnagram = true;

        if(word1.length() == word2.length()){
            for(int i =0; i< word1.length(); i++){
                if(ch1[i] != ch2[i]){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("Anagram");
            }else {
                System.out.println(" Not Anagram");
            }
        }else {
            System.out.println("Not anagram");
        }
    }
}
