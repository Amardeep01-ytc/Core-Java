package Arrays;

import java.sql.SQLOutput;

public class First_Array_program {
    public static void main(String[] args) {
        int [] marks= {98,77,86,96,97};

        //Displaying the Arrays (naive way/ easy way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the array (using for loop)
        //System.out.println("Printing using for loop");
        //for (int i= 0; i<marks.length; i++ ){
           // System.out.println(marks[i]);

            //Displaying thr array in reverse order
            System.out.println("Printing using for loop in reverse order ");
            for (int i= marks.length-1; i>=0 ; i-- ){
                System.out.println(marks[i]);
        }
    }
}
