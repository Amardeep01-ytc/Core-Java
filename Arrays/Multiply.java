import java.util.Scanner;
class Multiply{
public static void main(String[]args){
	System.out.println("Enter any number");
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	
	int mul = 1;
	while (num!= 0){
	int digit = num %10;
	num = num /10;
	 mul = mul* digit;
	}
	System.out.println("The multiplaction is :" +mul);
}	
}