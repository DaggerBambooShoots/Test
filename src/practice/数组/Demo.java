package practice.数组;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        test();
    }
    private static <T> void test(){
        User user = new User("111",10);
        List<T> list = new ArrayList<T>();
        list.add((T) user);
        list.add((T) "user");
        test2(list,user);
    }
    private static <T> void test2(List<T> list){
        System.out.println(list);
        User user = new User("111",10);
        list.remove(user);
        System.out.println(list);
    }
    private static void test2(List<?> list,User user){
        System.out.println(list);
        list.remove(user);
        System.out.println(list);
    }
}
class User{
    public String name;
    private Integer age;
    User(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
