package 测试.数据类型;

public class 数据转换 {
    public static void main(String[] args) {
        double double1 = 0.23f+3.5;
        long b = 10000000000l+20;
        long long1 = 10000000l;
        int int1 =10;
        int1 += long1;
        byte byte1=127;
        byte1=127-1;
        short c = byte1;
        float a = 1235E8f;
        System.out.println(a>10000);

    }
}
/**
 * 层级关系
 * long>int>short>byte
 * byte+1是int 不是 short +了一个1
 *
 * 数字带E的是double或者float类型的
 *
 */
