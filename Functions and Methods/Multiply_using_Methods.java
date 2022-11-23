public class Multiply_using_Methods{
  public static int multiply(int a , int b){
	int product= a * b;
	return product;
	}

	public static void main(String []args){
	int a = 5;
	int b = 2;
	int prod = multiply(a,b);
	System.out.println("a * b = "+prod);
	}
}