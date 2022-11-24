//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class Sum_of_odd{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int i,N,sum = 0;
	System.out.println("Enter value of N: ");
	N = sc.nextInt();
	
	System.out.println("The N odd numbers :");
	for(i = 1; i <= N; i++){
		sum = sum + i;
		}
	System.out.println("the sum of N Odd Numbers:" +sum);
	}
}