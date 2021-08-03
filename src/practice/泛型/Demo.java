package practice.泛型;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> lists1 = new ArrayList();
        List<Integer> lists2 = new ArrayList();
        System.out.println(lists1.getClass());
        System.out.println(lists2.getClass());
        System.out.println(lists1.getClass().equals(lists2.getClass()));
        System.out.println(lists1 instanceof List);
        new String();
    }
}
