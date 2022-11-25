 // Function to calculate sum using function using Data Types
 
public class Overloading_using_DataTypes{
	public static int sum(int a, int b){
		return a+b;
		}
	public static float sum(float a,float b){
		return a+b;
		}
	
	public static void main(String []args){
		System.out.println(sum(5,5));
		System.out.println(sum(4.2f,5.2f));  
		}


}