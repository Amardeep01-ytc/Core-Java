import java.util.Scanner;
public class Pyramid_reverse{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n,j;
	System.out.println("Enter a no. of rows:");
	n= sc.nextInt();
	for( ; n>=1; n--){
	for(j=1; j<=n; j++){
	     System.out.print("*");
	}
		System.out.println();
	}	
}	
}