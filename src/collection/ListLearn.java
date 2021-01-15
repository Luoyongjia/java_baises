package src.collection;

import java.util.*;
/**
 * list子接口的使用
 * 有序有下表，可重复
 */
public class ListLearn {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        // add
        list.add("iphone");
        list.add("huawei");
        list.add(0, "xiaomi");

        // remove
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.toString());

        // iterator
        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 增强for
        for (Object phone : list) {
            System.out.println(phone);
        }
        // iterator
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // listIterator
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        // 指针恢复
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        // 判断
        System.out.println(list.contains("apple"));
        System.out.println(list.isEmpty());

        // 获取下标
        System.out.println(list.indexOf("apple"));

    }
}
