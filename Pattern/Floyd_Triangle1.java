public class Floyd_Triangle1{
public static void main(String[]args){
 	
	int n = 5 ;
	int number = 1;
	
	for(int i = 1;i<=n;i++){
		for(int j =1;j<=i; j++){
		if(number > 9){
		System.out.print(number++ +" ");
		}else
		System.out.print("0"+number++ +" ");
		
		}
		System.out.println();
	 }

}
}