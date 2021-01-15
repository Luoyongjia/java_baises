package src.collection;

import java.util.*;
/**
 * Collection 的使用：保存学生信息
 */
public class CollectionLearn2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student s1 = new Student("xiaoming", 20);
        Student s2 = new Student("xiaohong", 18);
        Student s3 = new Student("xiaoyong", 22);

        collection.add(s1);
        collection.add(s2);
        collection.add(s3);

        System.out.println(collection.size());
        System.out.println(collection.toString());

        // 删除
        collection.remove(s1);
        // 这种方法不能删除
        collection.remove(new Student("xiaoming", 20));
        System.out.println("删除之后:" + collection.size());

        // 遍历
        for (Object stu : collection) {
            Student s = (Student) stu;
            System.out.println(s.toString());
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }

        //判断
        System.out.println(collection.contains(s1));
        System.out.println(collection.isEmpty());
    }
}
