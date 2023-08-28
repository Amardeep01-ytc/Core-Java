package Methods_Functions;
import java.util.Scanner;
public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in rupess : ");
        double num = sc.nextDouble();
        convertDollor(num);
    }
    public static void convertDollor(double num)
    {
        double res = num / 81.87;
        System.out.println("The price of Dollor is : "+res);
         convertDhiram(num);
    }

    public static void convertDhiram(double num)
    {
        double res = num *3.67;
        System.out.println("The price of Dhiram is : "+res);
        convertEuro(num);
    }

    public static void convertEuro(double num)
    {
        double res = num / 4.07;
        System.out.println("The price of Euro : "+res);
        convertDong(num);
    }
    public static void convertDong(double num)
    {
        double res = num *26243.92;
        System.out.println("The price of Dong is : "+res);
    }


}
