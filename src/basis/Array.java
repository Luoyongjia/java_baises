package src.basis;

public class Array {
    public static void main(String[] args) {
        //静态初始化:创建+赋值
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        //动态初始化：包含默认初始化，初始化为0
        int[] b = new int[10];
        b[0] = 10;

        // //适合遍历，不适合做改动，没有下标
        // for (int x : a) {
        //     System.out.println(x);
        // }
        reverse(a);
        printArray(a);


        //--------------------
        //二维数组
        //--------------------
        int[][] array = { { 1, 2 }, { 3, 4 } };
        
    }

    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void reverse(int[] arrays) {
        int temp = 0;
        for (int i = 0; i < arrays.length / 2; i++) {
            temp = arrays[i];
            arrays[i] = arrays[arrays.length - 1 - i];
            arrays[arrays.length - 1 - i] = temp;
        }
    }
}
