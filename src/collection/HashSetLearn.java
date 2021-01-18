package src.collection;

import java.util.*;
/**
 * HashSet集合使用
 * 存储结构：哈希表（数组+连标+红黑树）
 */
public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        // 1添加元素
        hashSet.add("xiaoming");
        hashSet.add("xiaohong");
        hashSet.add("wanggang");
        System.out.println("元素的个数：" + hashSet.size());
        System.out.println(hashSet.toString());

        // 2删除
        hashSet.remove("xiaoming");

        // 3遍历
        // 增强for
        System.out.println("-------增强for-------");
        for (String str : hashSet) {
            System.out.println(str);
        }
        // Iteration
        System.out.println("-------Iterator-------");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4判断
        System.out.println(hashSet.contains("ganggang"));
        System.out.println(hashSet.isEmpty());
    }
}
