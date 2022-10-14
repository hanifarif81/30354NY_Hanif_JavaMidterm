package math_problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

        System.out.println(primeNumbers(1000000));
    }
    public static List<Integer> primeNumbers(int maxNumber) {
        List<Integer> primeNumbers = new ArrayList<>();

        if (maxNumber >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= maxNumber; i += 2) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

}
