import java.util.*;
public class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,a,b=0;
		System.out.println("Enter number");
		n=sc.nextInt();
		while(n>0){
			a=n%10;
			b=b*10+a;
			n=n/10;
			
		}
		System.out.println(b);
	}
}
//reverse
//palindrome
