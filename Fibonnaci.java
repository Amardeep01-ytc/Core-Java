import java.util.*;
public class Fibonnaci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b =1;
		int add;
		int n = sc.nextInt();
		
		System.out.println("The Fibonnaci series is :");
		
		for(int i = 0;i<=n; i++){
			System.out.println(a);
			
		add=a+b;
		a = b;
		b = add;
		}
	}
	
}
