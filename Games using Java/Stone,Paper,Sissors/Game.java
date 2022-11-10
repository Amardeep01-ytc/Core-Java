import java.util.*;
import java.lang.*;

public class Game {
    static int game(char you, char computer) {

        if (you == 's' && computer == 'p') return 0;

        else if (you == 'p' && computer == 's') return 1;

        if (you == 's' && computer == 'z') return 1;

        else if (you == 'z' && computer == 's') return 0;

        if (you == 'p' && computer == 'z') return 0;

        else if (you == 'z' && computer == 'p') return 1;

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char computer = ' ';
        int n = random.nextInt(1000) %100;
        if (n < 33) computer = 's';

        else if (n > 33 && n < 66) computer = 'p';

        else computer = 'z';

        System.out.println("\n\n\n\nEnter s for STONE, p for PAPER and z for SCISSOR\n");

        char you = sc.next().charAt(0);

        int result = game(you, computer);

        if (result == -1) {
            System.out.println("\n\nGame Draw!\n");
        } else if (result == 1) {
            System.out.println("\n\nWow! You have won the game!\n");
        } else {
            System.out.println("\n\nOh! You have lost the game!\n");
        }

        System.out.println("You choose : " + you + "\nComputer choose : " + computer + "\n");

    }
}
