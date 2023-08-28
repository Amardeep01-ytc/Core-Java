package New.Loops;

import java.util.Scanner;
public class Check_ranges_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = scanner.nextInt();

        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();

        System.out.println("The prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}
