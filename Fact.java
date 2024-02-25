import java.util.*;
public class Fact {
    public static int factorial(int n){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            x = x*i;
        }
        return x;
            
        
    }
    public static void main(String[] args) {
        int fact = factorial(0);
        System.out.println(fact);
    
    }

}
