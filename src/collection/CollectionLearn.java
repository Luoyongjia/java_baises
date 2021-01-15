package src.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * Collection接口的使用
 * 1. 添加元素
 * 2. 删除元素
 * 3. 遍历元素
 * 4. 判断
 */
public class CollectionLearn {
    public static void main(String[] args) {
        // 创建集合
        Collection collection = new ArrayList();
        // 添加
        collection.add("Apple");
        collection.add("WaterMellon");
        collection.add("Banana");
        System.out.println("The size of collection: " + collection.size());
        // toString
        System.out.println(collection);

        // delete
        collection.remove("Apple");
        System.out.println("The size of collection: " + collection.size());
        //collection.clear();

        // iteration
        System.out.println("------增强for循环-------");
        for (Object fruit : collection) {
            System.out.println(fruit);
        }
        // 迭代器
        System.out.println("------迭代器-------");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object str = it.next();
            System.out.println(str);
        }


        // 判断
        System.out.println("------判断-------");
        System.out.println(collection.contains("WaterMellon"));
        System.out.println(collection.isEmpty());
    }
}
