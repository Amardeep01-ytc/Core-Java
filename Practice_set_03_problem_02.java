
import java.util.Scanner;

public class Practice_set_03_problem_02{
    public static void main(String[] args) {
        /* Claculate income tax paid by an employe to the government as per the slots mentioned below:
                 income slab        tax
                    2.5l - 5.0l       5%
                    5.0L - 10.0L      20%
                    Above 10.0L       30%
          Note: There is no tax below 2.5L take input amount as an input from the user*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5){
            tax = tax+0;
        }
        else if(income>2.5f && income<=5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income<=10.0f) {
            tax = tax + 0.05f * (income -2.5f);
            tax = tax + 0.2f  * (income -5f);
        }
        else if (income>10.0f){
            tax = tax + 0.05f * (income -2.5f);
            tax = tax + 0.2f  * (income -5f);
            tax = tax + 0.3f  * (income -10.0f);
        }
        System.out.println("The total tax paid by the employee is: "+tax);
        }

    }
