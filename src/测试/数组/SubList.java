package 测试.数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubList {
    public static void main(String[] args) {
        List<Map<String, Object>> result = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        Map<String, Object> map3 = new HashMap<>();
        map1.put("name","1");
        map2.put("name","2");
        map3.put("name","3");
        result.add(map1);
        result.add(map2);
        result.add(map3);
        for (Map<String, Object> item:result){
            System.out.println(item.get("name"));
        }
        result=result.subList(0,2);
        for (Map<String, Object> item:result){
            System.out.println(item.get("name"));
        }
    }
}
