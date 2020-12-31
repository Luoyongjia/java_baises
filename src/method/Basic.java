package src.method;

public class Basic {
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    //属于类的一个类方法
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } 
        else if(a < b) {
            return b;
        } else {
            return 0;
        }
    }
}
