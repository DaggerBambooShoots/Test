package 测试.循环;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        List<String> s = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.forEach(item->{
            s.add(item+"");
        });
        for(String a:s){
            System.out.println(a);
        }
        System.out.println(s.contains("4"));;

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.forEach(item->{
            if(item==2){
                item=4;
            }
        });
        for(Integer r:a){
            System.out.println(r);
        }
        ArrayList<Map<String, Object>> groups = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("a","a");
        groups.add(map);

        Map<String, Object> map1 = new HashMap<>();
        map1.put("a","a");
        System.out.println(groups.contains(map1));;
    }
}
