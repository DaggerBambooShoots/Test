package 测试.数据类型;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Double带E {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("a","a");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("1","1");
        List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>() ;
        lists.add(map);
        lists.add(map2);
        int i = 0 ;
        for(Map<String, Object> item:lists){
            if(i==0){
                item.put("b","b");
            }else{
                item.put("2","2");
            }
            i++;
        }

        lists.forEach(item->{
            System.out.println(item);
        });
        double d = Double.parseDouble("3.927769621175308E7");
        long l = (long)d;
        System.out.println(d);
        System.out.println(l);
        System.out.println(new DecimalFormat("0").format("3.927769621175308E8").toString());;
    }
}
