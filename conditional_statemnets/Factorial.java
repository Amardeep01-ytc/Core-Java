package conditional_statemnets;

public class Factorial {
    public static int Fact(int n){
        int f = 1;
        for(int i = 1; i<= n; i++) {
            f = f * i;
        }
        return f;
    }
     public static int binCoeff(int n ,int r){
        int fact_n = Fact(n);
        int fact_r = Fact(r);
        int fact_nmr = Fact(n-r);

        int binCoeff =  fact_n / (fact_r * fact_nmr);
        return binCoeff;
     }

    public static void main(String[] args) {
        //System.out.println(Fact(3));
        System.out.println(binCoeff(5,2));
    }
}
