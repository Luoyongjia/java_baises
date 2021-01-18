package src.collection;

import java.util.*;

/**
 * HashSet的使用，pluse
 * 改写equals，修改相等元素的判断
 */
public class HashSetLearn2 {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<Person>();

        // 1添加数据
        Person p1 = new Person("xiaoming", 10);
        Person p2 = new Person("lingling", 22);
        Person p3 = new Person("weiwei", 23);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        System.out.println("元素个数：" + persons.size());
        System.out.println(persons.toString());

        // 2删除
        persons.remove(p1);

        // 3遍历
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        Iterator<Person> it = persons.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
