package conditional_statemnets;

public class Product_AandB {
    public static int multiply(int a ,int b){
        int product = a*b;
        return product ;
    }

    public static void main(String args[]){
        int a = 5;
        int b = 8;
        int prod = multiply(a,b);
        System.out.println(" a * b = "+prod);
        prod = multiply(4,10);
        System.out.println("a * b = "+prod);
    }
}
