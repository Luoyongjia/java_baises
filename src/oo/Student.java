package src.oo;

public class Student extends Person{

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void study() {
        System.out.println(this.name + "在学习");
    }
    
}

/* //类的实例化,返回一个自己的对象
        //student对象就是一个Student类的具体事例
        Student ming = new Student();
        Student hong = new Student();

        ming.setName("XiaoMing");
        System.out.println(ming.getName());
*/
