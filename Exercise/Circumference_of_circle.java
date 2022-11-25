//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class Circumference_of_circle{
	public static double getCircumference(double radius){
	   radius = 2*3.14*radius;
		}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		System.out.println(getCircumference(radius));
		
		}
}