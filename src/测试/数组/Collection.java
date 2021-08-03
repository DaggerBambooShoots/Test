package 测试.数组;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<HashMap<String, Object>> datalist=new ArrayList<HashMap<String, Object>>();

        HashMap<String, Object> datavalueItem0 = new HashMap<String, Object>();
        HashMap<String, Object> datavalueItem1 = new HashMap<String, Object>();
        HashMap<String, Object> datavalueItem2 = new HashMap<String, Object>();
        HashMap<String, Object> datavalueItem3 = new HashMap<String, Object>();
        datavalueItem0.put("value", 6);
        datavalueItem0.put("factoryName", "200MW及以下");
        datavalueItem1.put("value", 2);
        datavalueItem1.put("factoryName", "300MW级");
        datavalueItem2.put("value", 7);
        datavalueItem2.put("factoryName", "600MW级");
        datavalueItem3.put("value", 1);
        datavalueItem3.put("factoryName", "1000MW级");
        datalist.add(datavalueItem0);
        datalist.add(datavalueItem1);
        datalist.add(datavalueItem2);
        datalist.add(datavalueItem3);
        java.util.Collections.sort(datalist, new Comparator<Map<String, Object>>() {
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Double name1 = Double.valueOf(o1.get("value").toString()) ;//name1是从你list里面拿出来的一个
                Double name2 = Double.valueOf(o2.get("value").toString()) ; //name1是从你list里面拿出来的第二个name
                return name2.compareTo(name1);
            }
        });
        for(HashMap<String, Object> data:datalist){
            System.out.println(data.get("factoryName")+"----"+data.get("value"));
        }
        System.out.println("----------");
        List a =  datalist.subList(0,1);
        a.forEach(item->{
            System.out.println(item);
        });
        System.out.println("========");
        System.out.println("2".compareTo("1"));
    }
}
