import java.util.*;
public class Parameters {
    public static void printHelloWorld(){
        System.out.print("Hello");
        System.out.println(" World");
        return;
    }
    public static void calculateSum(int num1,int num2){//parameters.
        int sum = num1+num2;
        System.out.println("Sum of a and b: "+sum);
        return ;
    }
    public static void main(String[] args){
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);//Actual value.
        
        
    }
}
