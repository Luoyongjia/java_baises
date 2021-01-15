package src.collection;

import java.util.*;
/**
 * List 的使用
 */
public class ListLearn2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        // add,添加基本类型时会自动装箱，自动包装为包装类
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("The number of elements: " + list.size());
        System.out.println(list.toString());

        // delete,remove根据下标来删除
        list.remove(new Integer(20));
        list.remove((Object) 20);

        // sublist,含头不含尾
        List sublist = list.subList(1, 3);
        System.out.println(sublist.toString());
        


    }
}
