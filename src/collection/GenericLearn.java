package src.collection;

/**
 * 范型类
 * 语法：类名<T>
 * T是类型占位符，表示一种引用类型，可以写多个，用都好隔开
 */
public class GenericLearn<T> {
    // 不能用T来实例化，不能确保可用
    // 使用范型
    // 1创建变量
    T t;

    // 2添加方法,作为方法的参数
    public void show(T t) {
        System.out.println(t);
    }

    // 3范型作为方法的返回值
    public T getT() {
        return t;
    }
}
