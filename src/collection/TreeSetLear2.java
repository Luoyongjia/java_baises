package src.collection;

import java.util.*;

/**
 * 范型必须要实现Comparable
 * compareTo方法返回值为0时，为重复元素
 */
public class TreeSetLear2 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<Person>();

        Person p1 = new Person("xiaoming", 10);
        Person p2 = new Person("lingling", 22);
        Person p3 = new Person("weiwei", 23);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        persons.remove(p1);
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        Iterator<Person> it = persons.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

        System.out.println(persons.contains(p1));
        System.out.println(persons.isEmpty());

    }
}
