package Arrays;
import java.util.*;
public class Otp {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int min = 1000;
    int max = 9999;
    int sotp = (int)((Math.random()*(max-min))+min);
        System.out.println("OTP ="+sotp);

        int uotp;
        System.out.println("Enter Otp");
        uotp=sc.nextInt();
        String result;
        result=(sotp==uotp?"vaild OTP ":"Invalid otp");
        System.out.println(result);
    }
}
