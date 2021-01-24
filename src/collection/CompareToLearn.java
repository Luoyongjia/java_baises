package src.collection;

/**
 * CompareTo实现定制比较
 * Compareable:可比较的
 */
import java.util.*;
public class CompareToLearn {
    public static void main(String[] args) {
        // 创建集合并指定比较规则
        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1 == 0 ? n2 : n1;
            }
        });
    }
}
