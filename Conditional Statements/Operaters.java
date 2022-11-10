import java.util.Scanner;

public class Operaters {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Physics Marks : ");
        int physics = SC.nextInt();
        System.out.println("Enter English Marks : ");
        int english = SC.nextInt();
        System.out.println("Enter Chemistry Marks : ");
        int chemistry = SC.nextInt();
        System.out.println("Enter Maths Marks : ");
        int maths = SC.nextInt();
        System.out.println("Enter Computer Science Marks : ");
        int computer = SC.nextInt();

        float percentage = ((physics + english  +  chemistry + maths + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}
