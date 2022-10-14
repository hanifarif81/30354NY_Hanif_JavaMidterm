package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */


    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        String word1 = "RACECAR";
        String word2 = "MADAM";

        System.out.println(obj.palindrome(word1));
        System.out.println(obj.palindrome(word2));
    }

    String palindrome(String strin) {

        StringBuilder reversed = new StringBuilder();

    for(int i = strin.length() - 1; i >= 0; i--){
        reversed.append(strin.charAt(i));
    }

        return reversed.toString();
    }
}