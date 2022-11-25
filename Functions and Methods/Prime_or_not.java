//check number is prime or not using Functions and Methods(optimized way)
public class Prime_or_Not{
	public static boolean isPrime(int  n){
	 if(n == 2){
		return true;
			}	
	  for(int i = 2; i<= Math.sqrt(n); i++){
		if(n % 2==0){
		return false;
			}
		}
		return true;
	}
	public static void main(String []args){
		System.out.println(isPrime(17));
	}
	
}
