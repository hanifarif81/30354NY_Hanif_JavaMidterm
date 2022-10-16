package data_structures;

import java.util.ArrayList;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        ArrayList<String> passenger = new ArrayList<String>();

        //add elements in ArrayList
        passenger.add("Jhon");
        passenger.add("Tim");
        passenger.add("Sam");
        passenger.add("Tommy");
        passenger.add("Edward");
        System.out.println("Result Before removing :"  + passenger);


        //remove method
        passenger.remove( "Tim");
        System.out.println("after removing  element Tim  "+passenger);

        //get method
        System.out.println("get method: "+ passenger.get(2));

        //for each loop
        System.out.println("for each loop");
        for(String name:passenger){
            System.out.println(name);

        }
    }

}
