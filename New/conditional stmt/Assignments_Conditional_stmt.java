package New;

import java.util.Scanner;

public class Assignments_Conditional_stmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        //check temperature
        System.out.println("enter a temp : ");
        double temp= sc.nextDouble();
        if(temp > 100){
            System.out.println("You have fever");
        }
        else {
            System.out.println("You don't have fever");
        }*/

        int week =sc.nextInt();
        switch (week){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid input");

        }

    }
}
