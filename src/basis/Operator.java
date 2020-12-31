package src.basis;

public class Operator {
    public static void main(String[] args) {
        long a = 12314132123L;
        int b = 123;
        short c = 10;
        byte d = 8;

        System.out.println(a + b + c + d);  //Long
        System.out.println(b + c + d);      //Int
        System.out.println(c + d); //Int, 只要操作中只要有一个long结果就为long，其他的都为int类型
        
        //幂运算
        Math.pow(2, 3);

        //逻辑运算符：短路运算
        int e = 5;
        boolean f = (c < 4) && (c++ < 4);
        System.out.println(f);
        System.out.println(e); //e=5，所以与运算符前一个条件就不满足的时候是不会执行后面的判断条件的
        
        /*
        位运算：
         A = 0011 1100
         B = 0000 1101
        
         &：两个位数都是1，结果才是1     A & B = 0000 1100
         ｜：两个位只要有一个是1，就是1   A | B = 0011 1101
         ^：如果两个位置相同为0，不相同为1  A ^ B = 0011 0001
         ~：~B = 1111 0010
         
         ---------------------------------
        2 * 8 = 16如何做最快        2*2*2*2
        << 左移     (当前值)
        >> 右移
         */

        //字符串链接符
        int g = 10;
        int h = 20;

        System.out.println("" + g + h); //1020,只要出现了String类型，String类型之后的+字符串链接符，就是直接把两个都输出了
        System.out.println(g + h + ""); //30

        //三元运算符，x ? y : z
        /*
        if(x)
            y
        else
            z
        */


        

    }
}
