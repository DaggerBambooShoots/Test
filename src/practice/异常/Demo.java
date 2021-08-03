package practice.异常;

public class Demo {
    public static void main(String[] args) {
        String a =null;
        try{
            test(null);
        }catch (MsgException e){
            System.out.println(e.getMessage());
        }
    }
    public static void test(String name) throws MsgException {
            throw new MsgException("Name is empty!");
    }
}
