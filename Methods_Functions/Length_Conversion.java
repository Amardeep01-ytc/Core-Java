package Methods_Functions;
import java.util.Scanner;
public class Length_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in Inch : ");
        double num=sc.nextDouble();
        centimeter(num);
    }

    public static void centimeter (double num)
    {
        double res = 2.54 * num;
        System.out.println("The lenght in centimeter is :"+res);
        meter(num);
    }

    public static void meter(double num)
    {
        double res = num/100;
        System.out.println("The lenghth in meter is : "+res);
        kilometer(num);
    }

    public static void kilometer(double num)
    {
        double res = num/1000;
        System.out.println("The length in kilomter is : "+res);

    }
}
