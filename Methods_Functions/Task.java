package Methods_Functions;
/*design a method to print a number with their sum of digits and if sum of digit
   is even then check for prime and sum of digit is odd then check it is palindrome  */

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        //System.out.println("Main begins");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int ip = sc.nextInt();
        sumOfDigits(ip);
        //System.out.println("Main ends");

    }

    public static void sumOfDigits(int num) {
        //System.out.println("sumOfDogits() Begin");
        int sum=0;
        while (num!=0){
           sum += (num %=10);
            num /=10;
        }

        System.out.println("Sum of Digits is : "+sum);
        checkevenOdd(sum);
        
        //System.out.println("sumOfDigits() Ends");
    }
    public static void checkevenOdd(int sum){
        //System.out.println("evenOdd() Begins");
        if (sum%2==0)
        {
            System.out.println("sum is even: "+sum);
            checkPrime(sum);
        }
        else
        {
            System.out.println("sum is odd : "+sum);
            checkPalindrome(sum);
        }
        //System.out.println("evenOdd() Ends");
    }

    public static void checkPrime(int sum)
    {
        //System.out.println("checkPrime() Begins");
        int i;
        for (i=2;i<sum;i++)
        {
            if(sum % i==0)
            {
                break;
            }
        }
        if (sum == i)
        {
            System.out.println("It is Prime");
        }
        else
        {
            System.out.println("Not a prime");
        }
        //System.out.println("checkPrime() ends ");
    }
    public static void checkPalindrome(int sum)
    {
        //System.out.println("checkPalindrome() Begin");
        int rev=0;
        for (int i = sum; i !=0 ; i/=10) {
            rev =(rev*10)+(i%10);
        }
        if (rev ==sum)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        //System.out.println("checkPalindrome() Ends ");
    }

}

