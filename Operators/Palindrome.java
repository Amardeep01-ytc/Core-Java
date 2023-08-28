package Operators;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a > 0) {
            int rem1 = a % 10;
            a /= 10;

            int rem2 = a % 10;
            a /= 10;

            int rem3 = rem2 * 10 + rem1;
            int rem4 = rem1 *10 +rem2;//to compare

            if(rem3 ==rem4){
                System.out.println(rem3+" it is palindrome");
            }
            else {
                System.out.println(rem3+ "it is not palindrome");
            }
        }
    }
}



