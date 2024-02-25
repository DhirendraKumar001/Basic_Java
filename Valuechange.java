public class Valuechange {
    public static void changeA(int a){//call by value
        a = 10;
        return;
    }
    public static void main(String[] args) {
        int a = 5;
        changeA(a);
        System.out.println(a);

    }
    
}
