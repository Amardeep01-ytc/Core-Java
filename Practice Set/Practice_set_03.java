import java.sql.SQLOutput;
import java.util.Scanner;
public class Practice_set_03 {
    public static void main(String[] args) {
       /* WAP to find out whether a student is pass or fail;
        if it requries total 40% and at least 33% in each subject to pass.
        Assume 3 subjects and take marks as an input from the user*/
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry ");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Maths ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is:" +avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congrulatins, You have been Promated");
        }
        else{
            System.out.println("Sorry, you have not been promated! Please try again");
        }

     }
}
