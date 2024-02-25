import java.util.*;
public class Product {
    public static int multiplication(int x, int y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        x = sc.nextInt();
        y = sc.nextInt();
        int product = x*y;
        return product;
    }
    public static void main(String[] args) {
      int prod = multiplication(0,0);
      System.out.println(prod);
    }
    
}
