package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};

        System.out.println("The lowest number is: "+ LowestNumber(array));
    }
    public  static  int LowestNumber(int arr[]){

        int lowest = arr[0];// assume index 0 have the lowest value

        //check if any index .
        for(int i = 1 ; i< arr.length; i++){
            if(arr[i]<lowest){
                lowest = arr[i];
            }
        }
        return lowest;
    }

}
