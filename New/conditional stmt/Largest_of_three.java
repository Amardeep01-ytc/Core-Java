package New;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digits : ");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >=b && a>=c){
            System.out.println("Largest is A");
        }
        else if (b >= c){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is C");
        }
    }
}
