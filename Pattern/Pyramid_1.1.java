import java.util.Scanner;
public class Pyramid_Pattern{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter a no. of rows:");
	n= sc.nextInt();
	for(int i = 1  ; i < n; i++){
		for(int s = 1; s <= i; s++)
			System.out.println(" ");
		for(int j = 1; j < i; j++)
			System.out.println("*");
		System.out.println(); 
	}	
}	
} 