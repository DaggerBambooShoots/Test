package 测试.数组;

import java.util.HashMap;
import java.util.Map;

public class Splist {
    public static void main(String[] args) {
        String a = "a,b,c" ;
        String[] b = a.split(",");
        for(String item:b){
            System.out.println(item);
        }
        String q = null;
        String w = new String();
        String e = "";
        Map f = new HashMap<>();
        f.put("a","a");
        System.out.println(f.get("a"));
        System.out.println(f.get("b"));
    }
}
