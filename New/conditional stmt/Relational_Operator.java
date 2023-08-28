package New;

import java.util.Scanner;

public class Relational_Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a : ");
        int a  = sc.nextInt();
        System.out.println("Enter a vlaue of b :");
        int b = sc.nextInt() ;

        System.out.println((a == b));//equals to
        System.out.println((a != b));// not equals to
        System.out.println(a > b); // grater than
        System.out.println(a < b); //less than
        System.out.println(a >= b); //grater than equals to
        System.out.println(a <= b); //less than equals to
    }
}
