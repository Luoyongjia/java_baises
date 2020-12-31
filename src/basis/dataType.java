package src.basis;
//数据类型拓展，面试题

public class DataType {
    public static void main(String[] args) {
        //整数：    进制        二进制：0b  十进制  八进制：0   十六进制：0x
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("----------------");

        //---------------------------------------
        //浮点数:银行业务如何表示
        //BigDecimal     数学工具类
        //float     有限的，离散的      舍入误差，接近，但不等于
        //double
        //最好完全避免浮点数比较
        //---------------------------------------

        float f = 0.1f;         //0.1
        double d = 1.0 / 10;    //0.1

        System.out.println(f == d);     //false
        
        float d1 = 23131312312f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2); //true
        System.out.println("----------------");


        //---------------------------------------
        //字符拓展
        //---------------------------------------
        //unicode编码   2字节   65536字符       Excel   2 16 = 65536
        //U0000     UFFFF
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';                 //a
        
        System.out.println(c1);
        System.out.println((int)c1);        //强制转换为int
        System.out.println(c2);
        System.out.println((int) c2);
        System.out.println(c3);
        System.out.println("----------------");

        //转义字符
        //  \t  tab     制表符
        //  \n  换行

        //Why? 个人猜测：sa和sb是不同的储存地址，sc和sd是调用同一个储存空间中的内容
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);   //false
        
        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd); //true
        System.out.println("----------------");

        //---------------------------------------
        //布尔值
        //---------------------------------------
        boolean flag = true;
        if (flag) {
        }
        //Less is more  代码要精简易读 
    }
}
