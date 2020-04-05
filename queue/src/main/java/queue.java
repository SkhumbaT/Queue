import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.System.in;
import static java.lang.System.out;


public class queue {
    public static void main(String[] args) {

        Scanner queuein = new Scanner(in);
        Deque<Integer> queue = new ArrayDeque<> (); // create object of Dequeue
        HashSet<Integer> set = new HashSet<>(); // create object of the Hashset
        int HUI = MIN_VALUE;                         //Declare (HUI) Highest number of Unique Integers as int and assign to it smallest value that can be represented.

              out.println ("Please enter the number of integers in your array");
        int Number = queuein.nextInt();                     // Declare Number as integer and assign it to te scanner for input
              out.println ("Please enter the size of your sub array");
        int subArraySize = queuein.nextInt();               // Declare subarraysize as integer and assign it to te scanner for input
              out.println ("Please enter your " +Number + " numbers");
        
         // Declare queueint as integer and assign it to te scanner for input
        for (int i = 0; i < Number; i++) {
            int queueint = queuein.nextInt ( );
            queue.add(queueint);                              // add the input to both the ArrayDequeue and HashSet
            set.add(queueint);

            /*if size of subarray is equal to Dequeue size
            and if size of hashset is greater than Highest Number of Integers
            then Highest Number of Integers is determined by size of HashSet*/
        if (queue.size() == subArraySize) {
            if (set.size ( ) > HUI) {
                HUI = set.size();
            }
            int first = queue.remove();    /* DeQueue return then remove the element at the front of the container
                                           and if the front of the container is empty, HashSet Return and Remove the element at the front the container*/
        if (!queue.contains(first)) set.remove(first);
        }
     }
       out.println("The Highest number of Unique Integers is "+HUI + " --- Thank you \n" ); //print out the Highest number of Unique Integers

        main(args); // Re-Run the program
   }
}
