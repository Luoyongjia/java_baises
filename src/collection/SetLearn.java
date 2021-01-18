package src.collection;

import java.util.*;

/**
 * 测试set接口的使用
 * 特点：1. 无序、没有下表  2. 不能重复
 */
public class SetLearn {
    public static void main(String[] args) {
        // 创建集合
        Set<String> set = new HashSet<String>();

        // 1添加数据
        set.add("XiaoMi");
        set.add("Apple");
        set.add("Huawei");
        set.add("Huawei");  // 添加失败
        System.out.println("数据个数：" + set.size());
        System.out.println(set.toString());

        // 2删除
        // set.remove("XiaoMi");
        // System.out.println(set.toString());

        // 3遍历
        // 增强for
        System.out.println("-------增强for-------");
        for (String str : set) {
            System.out.println(str);
        }
        // Iteration
        System.out.println("-------Iterator-------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4判断
        System.out.println(set.contains("Huawei"));
        System.out.println(set.isEmpty());
    }
}
