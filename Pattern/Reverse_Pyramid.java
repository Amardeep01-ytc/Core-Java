import java.util.Scanner;
public class Reverse_Pyramid{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter a no. of rows:");
	n= sc.nextInt();
	for(int i = 0 ; i < n; i++){
		for(int j = 0; j < n - i; j++){
	     		System.out.print(j+2+i);
		}
		System.out.println();
	}	
}	
}