public class Hollow_Triangle{
	public static void main(String args[]){
	int row =10;
	
	for(int i=0;i<=row;i++){
		
		for(int j =0; j<=i;j++){
			
			if(j==0||i==j||i==row){
			   System.out.print("* ");
			}
		
			else{
			System.out.print("  ");	
			}
		}
		System.out.println();	
		
		}
			
	}
}
