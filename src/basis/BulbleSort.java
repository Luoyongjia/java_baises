package src.basis;
//比较相邻的元素，如果第一个比第二个大，就交换位置
//每一次比较都会产生较大或者较小的
import java.util.Arrays;
public class BulbleSort {
    public static void main(String[] args) {
        int[] a = { 23, 43, 643, 235, 745, 63, 457, 23, 12, 873 };
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j+1] < a[j]) {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        
    }
    
}
