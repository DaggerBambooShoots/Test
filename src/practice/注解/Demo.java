package practice.注解;

import java.util.HashMap;
import java.util.Map;

@TestAnnotation
public class Demo {
    public static void main(String[] args) {
//        System.out.println(TestAnnotation.age);
        System.out.println(Demo.class.isAnnotationPresent(TestAnnotation.class));
        System.out.println(Demo.class.getAnnotation(TestAnnotation.class));
    }
}
@interface MyAnnotation {
    // 定义公共的final静态属性
    int age = 25;

    // 定义公共的抽象方法
//    String name();
}
