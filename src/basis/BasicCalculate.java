package src.basis;

//计算输入的多个整数数字的平均值与和, 非数字结束
import java.util.Scanner;

public class BasicCalculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //和
        double sum = 0;
        int m = 0;

        //通过循环判断是否还有输入
        while (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            m++;
            sum = sum + num;
        }
        System.out.println("Sum = " + sum + "ave = " + (sum / m));
        sc.close();
    }
}
