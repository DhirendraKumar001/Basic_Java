import java.util.Scanner;

public class Prime1 {
    public static void isPrime(int n) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();

        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                System.out.println(n+" is not a prime number");
            }
            else{
                System.out.println(n+" is a prime number");
            }
            return;
        }
        
    }
    public static void main(String[] args) {
        isPrime(0);
    }
    
}
