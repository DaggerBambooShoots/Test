package 测试.数组;

import java.util.ArrayList;
import java.util.List;

public class ContainsTest {
    public static void main(String[] args) {
        String a[] ={"a","b","c"};
        String ac[] ="a,b,c".split(",");
        System.out.println(ac[1]);
        List<String> b = new ArrayList<>();
        b.add("a");
        b.add("b");
        b.add("c");
        List<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        System.out.println(b.contains(a));
        int aa =1;
        String bb = "1";
        System.out.println(aa==1);
        System.out.println("-----------");
        System.out.println(b.contains("b"));
    }
}
