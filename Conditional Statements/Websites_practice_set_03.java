import java.util.Scanner;
public class  Websites_practice_set_03{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
 	String website = sc.next  ();
	if(website.endsWith(".org")){
		System.out.println("This is organizational website");
	}
	else if(website.endsWith(".com")){
		System.out.println("This is Commercial website");
	}
	else if(website.endsWith(".in")){
		System.out.println("This is an Indian website");
	}
	}
}