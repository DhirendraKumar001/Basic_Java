import java.util.*;
public class Swap {

    public static void swaping(int a,int b){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
       
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        return;
    }
    public static void swap(int x,int y){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        return;


    }

    public static void main(String[] args) {
        swaping(0, 0);
        swap(0,0);
        

    } 
}
