package src.collection;

import java.util.*;
/**
 * ArrayList的shiyong
 * 存储结构：数组，查找遍历速度快，增删慢
 */
public class ArrayListLearn {
    public static void main(String[] args) {
        // create size = 0，每次扩容为原来的1.5倍
        ArrayList arrayList = new ArrayList<>();
        // add
        Student s1 = new Student("xiaoming", 18);
        Student s2 = new Student("xiaohong", 17);
        Student s3 = new Student("xiaoxin", 20);

        System.out.println("The size of arraylist: " + arrayList.size());
        System.out.println(arrayList.toString());
        // delete
        arrayList.remove(s1); //equals(this == obj),重写equals()之后这里面就可以new一个再删了
        
        //iterator
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }
        // ListIterator
        ListIterator lit = arrayList.listIterator();
        while (lit.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }

        //逆序
        while (lit.hasPrevious()) {
            Student s = (Student) lit.previous();
            System.out.println(s.toString());
        }

        // 判断
        System.out.println(arrayList.contains(new Student("xiaoming", 18)));
        
        // 查找
        System.out.println(arrayList.indexOf(new Student("xiaoming", 18)));

    }
}
