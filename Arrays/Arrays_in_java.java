public class Arrays_in_java{
public static void main(String[]args){
	/*int [] marks = {98, 56,87,46,90};
	System.out.println(marks.length);
	System.out.println(marks[3]);
	*/
	int [] marks = {97,79,99,65,57};
	
	//Displaying the Array(naive method or easy method)
	System.out.println("Printing using naive method");
	System.out.println(marks[0]);
	System.out.println(marks[1]);
	System.out.println(marks[2]);
	System.out.println(marks[3]);
	System.out.println(marks[4]);
	
	//Displaying the array using (for loop)
	System.out.println("Printing  using for loop");
	for(int i=0; i<marks.length;i++){
		System.out.println(marks[i]);
		} 
	
		
}	
}