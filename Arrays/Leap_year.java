import java.util.Scanner;
public class Leap_year{
	public static void main(String[] args){
	int year;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year ::");
	year = sc.nextInt();
	
	boolean isLeap = false;
//	if (year % 4 == 0){
//		System.out.println("is a leap year."+ year );
//	}
//	else if(year % 100 == 0){
//		System.out.println("is not a leap year."+year);
//	}
//	else if(year % 400 == 0){
//		System.out.println("is a leap year."+year);
//	}
//	else{
//		System.out.println("is not a leap year."+year );
//	}
	if(year % 4 ==0){
		isLeap = true;

		if(year % 100 ==0){
			if(year % 400 == 0){
				isLeap =true;
			}else{
				isLeap = false;
			}
		}
	}
	System.out.println((isLeap) ? "Leap Year" : "Not a Leap Year" );
}
}