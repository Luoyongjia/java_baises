package src.collection;

import java.util.*;
/**
 * vector类方法实践
 */
public class VectorLearn {
    public static void main(String[] args) {
        // create
        Vector vector = new Vector<>();
        // add
        vector.add("草莓");
        vector.add("🥭");
        vector.add("🍉");

        // delete
        // vector.remove(0);
        // vector.remove("草莓");

        // 遍历
        Enumeration en = vector.elements();
        while (en.hasMoreElements()) {
            String o = (String) en.nextElement();
            System.out.println(o);
        }

        // 判断
        System.out.println(vector.contains("🍉"));
        System.out.println(vector.isEmpty());

        // 其他方法
        //firstElement, lastElement,elementAt, get
        
    }
}
