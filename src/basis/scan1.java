package src.basis;

import java.util.Scanner;

public class scan1 {
    public static void main(String[] args) {
        
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scan = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if(scan.hasNext()){
            String str = scan.next();    //使用next的方式接收
            System.out.println("输入的内容为：" + str);
        }

        //凡是IO流的东西都需要手动关闭，不然就得占用资源
        // scan.close();

        //hasNextLine
        Scanner scan2 = new Scanner(System.in);

        if(scan2.hasNextLine()){
            String str = scan2.nextLine();
            System.out.println("nextLine输出为：" + str);
        }

        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");
        //hasNextxxx有很多种
        if(scan.hasNextInt()){
            int num = scan.nextInt();   //这里要注意变量的类型！
            System.out.println("整数数据: " + num); 
        } else {
            System.out.println("输出的不是整数");
        }
        scan.close();
        scan2.close();
    }
}
