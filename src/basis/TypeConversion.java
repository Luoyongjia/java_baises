package src.basis;

public class TypeConversion {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;      //内存溢出，所以成了-128
        
        System.out.println(i);
        System.out.println(b);
        /*
        注意点：
        1. 不能对于布尔值进行转换
        2. 不能把对象类型转换为不相干的类型
        3. 高容量转低容量需要强制类型转换
        4. 转换时可能存在内存溢出或者进度问题
        */

        System.out.println("---------------");
        System.out.println((int) 23.7);         //23
        System.out.println((int) -45.89f);      //-45

        //自动转换
        System.out.println("---------------");
        char c = 'a';
        int d = c + 1;
        System.out.println(c);
        System.out.println(d);

        //溢出问题
        System.out.println("---------------");
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;              //-1474836480, 计算时溢出了

        long total2 = money * years; //-1474836480, int * int 结果是int，算出int之后再转换成long，所以依然是错的
        long total3 = (long) money * years;

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);

        //L为long，l常被视为1
    }
}
