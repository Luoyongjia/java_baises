package src.collection;

/**
 * 学生类
 */
public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[name = " + name + ", age = " + age + "]";
    }
    @Override
    public boolean equals(Object obj) {
        // 是否为同一对象
        if (this == obj)
            return true;
        
        // 判断是否为空
        if (obj == null)
            return false;
        // 判断是否为Student类型
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if(this.name.equals(s.getName())&& this.age==s.getAge())
                return true;
        }
        return false;
    }

}
