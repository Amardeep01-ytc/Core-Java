import java.util.Scanner;
public class Pattern_1{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
	int n,i,j;
	System.out.println("Enter a no. of rows:");
	n= sc.nextInt();
	for(i=1;i<=n;i++){
	   for(j=1;j<=i;j++){
		System.out.print(i);
	}
		System.out.println();

	}	
}	
}