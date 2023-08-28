package New.Loops;

public class PowerOf2 {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int powerOf2 = 1;
        for (int i = 0; i <= n ; i++) {
            System.out.println(powerOf2);
            powerOf2 *= 2 ;
        }
    }
}

