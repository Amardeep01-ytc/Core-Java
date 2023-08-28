package com.java.New;

import java.util.Scanner;

public class Loops {
    public static void main(String []args){
        System.out.println("Enter a salary : ");
        Scanner sc= new Scanner(System.in);
        int sal = sc.nextInt();
        if (sal > 20000){
            sal += 2000;
        }
        else{
            sal += 1000;
        }
        System.out.println("Bonus added in Salary will be "+sal);
    }
}
