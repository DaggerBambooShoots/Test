package 测试.数组;

import java.util.Arrays;

public class copy_括号 {
    public static void main(String[] args) {
        int[] a = new int[]{22, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b= Arrays.copyOfRange(a,0,1);
        for(int item:b){
            System.out.println(item);
        }
        int [] c = new int[5];
        for (int item :
                c) {
            System.out.println(item);
        }
    }
}
