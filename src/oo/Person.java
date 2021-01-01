package src.oo;

//java --->class
public class Person {

    private String name;
    private int age;
    //构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person() {
        this.name = "Mingmingming";
        this.age = 0;
    }


}

// Person person = new Person();
//有参构造后，无参构造需要重构