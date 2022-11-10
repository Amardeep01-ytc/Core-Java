import java.util.Scanner;
public class Pyramid_Pattern{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter a no. of rows:");
	n= sc.nextInt();
	for(int i = 0 ; i < 5; i++){
	    for(int j = 0; j<5-i-1; j++)
		System.out.print(" ");
	
	    for(int k=0 ; k <= i ; k++)
		System.out.print("*");
	
	   System.out.println();
	}
    }	
} 