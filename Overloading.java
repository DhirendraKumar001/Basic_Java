public class Overloading{//Method Overloading

    public static int sum(int x, int y){
        return x+y; 
    }
    public static int sum(int x, int y, int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,8));
        System.out.println(sum(5,8,3));
    }
}
   