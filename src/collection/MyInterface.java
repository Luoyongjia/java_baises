package src.collection;

/**
 * 范型接口
 * 语法：接口名<T>
 * 不能创建范型常量
 */
public interface MyInterface<T> {
    String name = "张三";
    
    T server(T t);
}
