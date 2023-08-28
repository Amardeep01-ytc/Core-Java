package conditional_statemnets;
import java.util.Scanner;
public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = sc.nextInt();
        int rev =0;
        while(num > 0)
        {
            int rem =num %10;
            rev =(rev *10 )+rem;
            num /= 10;
        }
        System.out.println("the reverse of entered num is "+rev);
    }
}
