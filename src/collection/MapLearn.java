package src.collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Map接口的使用
 * 特点：1. 存储的是键值对
 *      2. 键不能重复，值能重复，无序
 */
public class MapLearn {
    public static void main(String[] args) {
        // 创建Map
        Map<String, String> map = new HashMap<>();

        // 1 添加元素
        map.put("cn", "Chinese");
        map.put("uk", "United Kindon");
        map.put("usa", "usa");

        // 2 删除
        map.remove("usa");

        // 3 遍历
        // 3.1 使用keySet();
        System.out.println("-------keySet()方法遍历-----------");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + ":"+map.get(key));
        }
        // 3.2 使用entrySet()方法
        System.out.println("-------entrySet()方法遍历-----------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 4 判断
        map.containsKey("cn");
        map.containsValue("cn");
    }
}
