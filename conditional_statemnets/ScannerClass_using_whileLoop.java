package conditional_statemnets;
import java.util.*;
public class ScannerClass_using_whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int range= sc.nextInt();
        int i=1;
        while(i<=range)
        {
            System.out.println(i+ " ");
            i++;
        }
       /* int range = sc.nextInt();
       for(int i=1;i<=range ; i++){
           System.out.println(i);
       }
        System.out.println("");

        */


    }
}
