package Patterns;

import java.util.Scanner;

public class No_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int n = 5;

        int count = 1;
        for (int i = 0; i < n; i++) {
//            loop for spaces
            for (int j = 0; j < i; j++) {
                count += 2;
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                if (i == 0 || i == j || j == n - 1) {
                    System.out.print(count + " ");

                } else {

                    System.out.print("  ");
                }
                count += 2;
            }
            count = 1;
            System.out.println();

        }
    }
}
