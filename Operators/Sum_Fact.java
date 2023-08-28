package Operators;

import java.util.Scanner;
public class Sum_Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num =sc.nextInt();
        int Fact =1;
        //Factorial
        while(Fact<=num)
        {
            if(num%Fact==0){
                System.out.println(Fact);
            }
            Fact++;
        }

        //sum
        int sum = 0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                sum=sum +i;
            }
        }
        System.out.println("Sum is "+sum);

    }
}

