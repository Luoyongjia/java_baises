package src.basis;

import java.util.Arrays;

public class ArraysL {
    public static void main(String[] args) {
        int[] a = { 2, 6, 3, 8, 4, 6, 3, 2, 5 };
        printArray(a);
        // System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //填充，将其全部整成0
        Arrays.fill(a, 2, 4, 0);
        
    }
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }
}
