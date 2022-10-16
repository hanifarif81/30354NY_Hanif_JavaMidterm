package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number "+ Search(array,10));
    }

    public static int Search(int arr[],int n){

        int sumArr = 0;
        int sumNumber = 0;

        // add all the array elements
        for(int i=0;i<arr.length;i++){
            sumArr += arr[i];
        }

        //add all the numbers from 1-n
        for(int j=1;j<=n;j++){
            sumNumber += j;
        }
        return  sumNumber -  sumArr;
    }
}
