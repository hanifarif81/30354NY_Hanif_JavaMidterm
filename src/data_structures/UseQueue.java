package data_structures;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {

        Queue<Integer> myQueue = new PriorityQueue<>();

        myQueue.add(100);
        myQueue.add(250);
        myQueue.add(300);
        myQueue.add(405);
        myQueue.add(540);
        myQueue.add(610);

        System.out.println("PEEK AT THE FIRST ELEMENT: ");

        System.out.print(myQueue.peek());

//      removed first element because of FIFO
        myQueue.remove();

        System.out.println("\nREMOVE THE FIRST ELEMENT ");
//      peeking the first element
        System.out.print(myQueue.peek());

        System.out.println("\nPEEKING THE FIRST ELEMENT ");

        Iterator<Integer> myIterator = myQueue.iterator();

        for (int number : myQueue) {
            System.out.println(myIterator.next());
        }

    }

}
