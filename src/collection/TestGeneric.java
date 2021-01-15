package src.collection;

public class TestGeneric {
    public static void main(String[] args) {
        // 使用范型类创建对象
        // 1范型只能是引用类型，不同范型对象不能相互复制
        GenericLearn<String> genericLearn = new GenericLearn<String>();
        genericLearn.t = "Hello";
        genericLearn.show("大家好");
        String string = genericLearn.getT();

        GenericLearn<Integer> genericLearn2 = new GenericLearn<Integer>();

        
    }
}
