package New;
import java.util.Scanner;

public class Basic_IF_stmt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are adult:  vote,Drive ");
        }
        else if (age > 13 && age < 18){
            System.out.println("you are teenager ");
        }
        else{
            System.out.println("You are not adult or teenager");
        }
    }
}
