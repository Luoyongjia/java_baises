package src.collection;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [ name = " + name + "age = " + age + "]";
    }

    // 比较规则：先按姓名比，再按年龄比
    @Override
    public int compareTo(Person o) {
        int n1 = this.getName().compareTo(o.getName());
        int n2 = this.age - o.getAge();

        return n1 == 0 ? n2 : n1;
    }
}
