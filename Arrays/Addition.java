import java.util.Scanner;
class Addition{
public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int sum = 0;
	while(num !=0){
	int digit = num %10;
	num = num/10;
	sum = sum + digit;
	
	}
	System.out.println(sum);
}		
}