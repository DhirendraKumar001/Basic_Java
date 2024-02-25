import java.util.Scanner;

public class Bionomial {// Bionomial Cofficient.
     public static int factorial(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x = x * i;
        }
        return x;
    }

    public static int binCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        fact_n = sc.nextInt();

        System.out.println("Enter the r:");
        fact_r = sc.nextInt();

        

        int binCoff = fact_n / (fact_r * fact_nmr);

        return binCoff;
    }

     public static void main(String[] args) {
        int BionomialCofficient = binCoff(0, 0);
        System.out.println("Bionomial Cofficent of n and r = "+BionomialCofficient);

    }
}

