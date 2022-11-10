import java.util.*;
class Prime{
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sc.nextInt();
	 boolean flag = false;
		for(int i=2; i< num; i++){
		   if(num %i==0){
			flag = false;	
			break;
			
			}
		    else{
			flag = true;
			
			}
		}
		if (flag == true){
		System.out.println("It is Prime");
		}
		else{
		System.out.println("It is not Prime");
		}
}
}