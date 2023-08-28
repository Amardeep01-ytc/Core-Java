package Operators;

import java.util.Scanner;
public class Neon_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num= sc.nextInt();
        int sqr= num*num;
        int sum=0;

        while(sqr>0){
            sum=sum+sqr%10;
            sqr/=10;
        }
        if(sum==num){
            System.out.println("it is neon number");
        }
        else{
            System.out.println("it is not a neon number");
        }
    }
}
