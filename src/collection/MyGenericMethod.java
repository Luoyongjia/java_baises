package src.collection;

/**
 * 范型方法
 * 语法<T>  返回值类型
 */
public class MyGenericMethod {
    // 范型方法，使用的时候不需要著明类型
    public <T> void show(T t) {
        System.out.println(t);
    }
}
