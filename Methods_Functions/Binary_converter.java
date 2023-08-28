package Methods_Functions;

//import java.util.Scanner;
public class Binary_converter {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter a value :");
        decimalToBinary(10);
        binaryToDecimal(100);
    }
    public static void decimalToBinary(int num)
    {
        String res= "";
        while (num > 1)
        {
            res= (num%2) + res;
            num /= 2;
        }
        System.out.println(res);
    }
    public static void binaryToDecimal(int num)
    {
        String res="";
        while (num > 1)
        {
            res =(num%8) + res;
            num /=8;
        }
        System.out.println(res);
    }

}
