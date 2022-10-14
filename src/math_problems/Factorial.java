package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        System.out.println(recursionFactorial(5));
        System.out.println(recursionFactorial(10));
    }
    //calculating Factorial using Recursion method
    public static int recursionFactorial(int number){
        int x = 0;
        if(number <= 1){
            return number;
        }
    x = x + (number * recursionFactorial(number-1));
        return x;
    }


}
