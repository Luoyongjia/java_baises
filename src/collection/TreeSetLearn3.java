package src.collection;

import java.util.*;
/**
 * 要求：使用TreeSet实现字符串按照长度进行排序
 * helloworld, zhang list wangwu beijing xian nanjing
 */
public class TreeSetLearn3 {
    public static void main(String[] args) {
        TreeSet<String> strs = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                int n1 = str1.length() - str2.length();
                int n2 = str1.compareTo(str2);
                return n1 == 0? n2 : n1;
            }
        });

        // 添加数据
        String s0 = "helloworld";
        String s1 = "zhang";
        String s2 = "list";
        String s3 = "wangwu";
        String s4 = "beijing";
        String s5 = "xian";
        String s6 = "nanjing";
        strs.add(s0);
        strs.add(s1);
        strs.add(s2);
        strs.add(s3);
        strs.add(s4);
        strs.add(s5);
        strs.add(s6);

        System.out.println(strs.toString());

    }
}
