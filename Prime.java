import java.util.Scanner;

public class Prime{
    public static void isPrime(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        for(int i=2; i<=(n-1); i++){
            if (n%i==0){//completely dividing.
                System.out.println(n+" is not a prime number");
            }
            else{
                System.out.println(n+" is a prime number");
            }
            return;
        } 
        
    }
        
    public static void main(String[] args) 
    {
        isPrime(0);
    }
        
}
