package New;

import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*System.out.println("Enter a number : ");
        int num =sc.nextInt();

        //ternary operator
        String type= ((num %2) == 0) ? "even" : "odd";
        System.out.println(type);*/

        System.out.println("Enetr marks : ");
        int marks = sc.nextInt();

        String result= (marks >= 35 ? "pass" : "fail");
        System.out.println(result);
    }
}
