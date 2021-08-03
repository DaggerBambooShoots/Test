package 测试.scv文件读取.test;


import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws Exception {
        ReadCSVFiletest read = new ReadCSVFiletest();
        List<Map<String, String>> list = read.listD1;
        for(Map<String, String> item:list){
            System.out.println(item);
        }
    }

}
