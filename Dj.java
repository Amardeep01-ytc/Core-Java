import java.util.*;

public class Dj {
    public static void main(String args[]) {

        int n = 4;
        int number = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (number > 9) {
                    System.out.print(number++ + " ");
                } else
                    System.out.print("" + number++ + " ");

            }
            System.out.println();
        }
    }
}
       /* int a,b,c,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        a= sc.nextInt();

        System.out.println("Enter Second Number");
        b=sc.nextInt();

        System.out.println("Enter Third Number");
        c=sc.nextInt();
        sum= a+b+c;
        System.out.println("Total sum is : "+sum);
          */


        /*
        int a=2;
        int b=3;
        int c=7;
        int mul= a*b*c;
        System.out.println(" mul " +mul);

        float z= 10.00f;
        float t= 10.45f;
         float add= z+t;
        System.out.println(" add " +add);

         */
