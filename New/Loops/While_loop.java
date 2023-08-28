package New.Loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      /*  int count = 0;
        while (count < 10){
            System.out.println("hello java");
            count ++;
        }*/

      /*  int num = 1;
        while (num <= 10){
            System.out.println(num);
            num ++;
        }*/
    /*    System.out.println("Enter number : ");
        int rang = sc.nextInt();
        int count =1;
        while(count <= rang){
            System.out.println(count );
            count ++;
        }*/

        //to print sum of n natural numbers
        int num = sc.nextInt();
        int sum=0;
        int i = 1;

        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("sum is : "+sum);



    }
}
