package Operators;

import java.util.Scanner;
public class Harshad_num {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num=sc.nextInt();
        int sum=0;
        int rem=0;
        int temp =num;

        while(num>0){
            rem=num%10;
            sum= sum +rem;
            num/=10;
        }
        num =temp;
        if ( temp % sum ==0){
            System.out.println("it is harshad number");
        }
        else{
            System.out.println("not a harshad number");
        }
    }
}
