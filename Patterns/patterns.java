public class patterns{
	public static void main(String args[]){
	for(int i =1;i<=5;i++){
		for(int j= 1; j<=i;j++){
			System.out.print("*");
			}
			System.out.println();
		}

/*
*
**
***
****
*****
*/
	// Inverted Star Pattern
	
	 int n =5;
	 for(int line=1; line<=n;line++){
		 for(int star=1;star <=n-line+1;star++){
			 System.out.print("*");
		 }
		System.out.println();
	 }

/*	
*****
****
***
**
*
*/
	//half pyramid with numbers
	for(int a=1; a<=5;a++){
		for(int num=1;num<=a;num++){
			System.out.print(num);
		}
		System.out.println();
		}
				
	}
}
