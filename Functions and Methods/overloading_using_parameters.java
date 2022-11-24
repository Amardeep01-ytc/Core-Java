 public class overloading_using_parameters{
	
	// to claculate sum of  2 numbers

	public static int sum(int a, int b){
	return a+b;
		}
	
	//to calculate sum of 4 numbers
	public static int sum(int a, int b, int c, int d){
	return a+b+c+d;
	}
	
	//to calculate multiplaction of 2 numbers
	public static int multiply(int a, int b){
	return a*b;
	}
	
	public static void main(String args[]){
	System.out.println(sum(2,3));
	System.out.println(sum(2,1,3,4));
	System.out.println(multiply(2,3));
	}
	
}