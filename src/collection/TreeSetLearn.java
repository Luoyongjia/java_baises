package src.collection;

import java.util.*;
/**
 * TreeSet的使用
 * 存储结构：红黑树
 */
public class TreeSetLearn {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("Hello");

        // treeSet.remove("xyz");

        for (String string : treeSet) {
            System.out.println(string);
        }

        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(treeSet.contains("abc"));
        System.out.println(treeSet.isEmpty());

    }
}
