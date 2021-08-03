package 测试.路径;

public class Demo {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(new Demo().getUrl());
    }
    public String getUrl(){
        String xmlpath = Demo.class.getResource("/aa.txt").getPath();
        return xmlpath;
    }
    public String getxx(){
        String xmlpath = this.getClass().getClassLoader().getResource("/prop.properties").getPath();
        return xmlpath;
    }
}
