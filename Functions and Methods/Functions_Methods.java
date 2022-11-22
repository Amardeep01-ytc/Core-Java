import java.util.*;
public class Functions_Methods{

	public static void calculateSum(){
	Scanner sc = new Scanner(System.in);	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum = a + b;
	System.out.println("The sum is:" +sum);
}


public static void main(String []args){
	calculateSum();
	}
}