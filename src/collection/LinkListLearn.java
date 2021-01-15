package src.collection;

/**
 * LinkedList的使用
 * 存储结构：双向链表
 */
import java.util.*;
public class LinkListLearn {
    public static void main(String[] args) {
        // create
        LinkedList linkedList = new LinkedList<>();

        // 添加
        Student s1 = new Student("xiaoming", 18);
        Student s2 = new Student("xiaohong", 17);
        Student s3 = new Student("xiaoxin", 20);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);

        System.out.println("元素个数：" + linkedList.size());
        System.out.println(linkedList.toString());

        // Delete
        linkedList.remove(s1);
        System.out.println("删除之后：" + linkedList.size());
        System.out.println(linkedList.toString());

        // 遍历
        // for
        System.out.println("-----for------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        // 增强for
        System.out.println("-----增强for------");
        for (Object o : linkedList) {
            Student s = (Student) o;
            System.out.println(s.toString());
        }
        // 迭代器
        System.out.println("-----迭代器------");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }

        System.out.println("-----list迭代器------");
        ListIterator lit = linkedList.listIterator();
        while (lit.hasNext()) {
            Student s = (Student) lit.next();
            System.out.println(s.toString());
        }

        // 判断
        System.out.println(linkedList.contains(s1));
        System.out.println(linkedList.isEmpty());

        // 获取get
    }
}
