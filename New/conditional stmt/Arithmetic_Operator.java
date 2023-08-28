package com.java.New;

import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a : ");
        int a =sc.nextInt();
        System.out.println("Enter value of b :");
        int b= sc.nextInt();

        System.out.println("add =" +(a + b));
        System.out.println("substract ="+(a - b));
        System.out.println("Multiply ="+(a * b));
        System.out.println("Divide ="+(a / b));
        System.out.println("Modulo (Reminder)="+(a % b));
    }
}
