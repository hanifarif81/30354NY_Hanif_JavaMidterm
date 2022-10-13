package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/


    static int fibonacci(int num)
    {
        if (num <= 1)
            return num;

        return fibonacci(num -2) + fibonacci(num -3);
    }

    // Main method
    public static void main(String args[])
    {
        // Given Number N
        int N = 40;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {
            //Print method fibonacci of i and space
            System.out.print(fibonacci(i) + " ");
        }
    }
}
