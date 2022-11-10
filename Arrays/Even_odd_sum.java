import java.util.Scanner;
class Even_odd_sum{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("The sum is :");

	int num =sc.nextInt();
	int evenSum = 0;
	int oddSum = 0;
	
	while(num != 0){
	 int digit = num %10;
	num =num/10;
	 if (digit %2== 0){
	 evenSum = evenSum + digit;
	}
	
	else{
		oddSum = oddSum + digit;
		
	}
		
}
 			System.out.println("This is even Sum" +evenSum);

			System.out.println("This is odd Sum" +oddSum);
}
	}
