package 测试.fanshe;

import java.lang.reflect.Method;

public class FanShe {
    public static void main(String[] args) throws Exception {
        String user = "fanshe.User";
        Class clazz = Class.forName(user);


        String name = "User";
        Class clazz2 = name.getClass();
        System.out.println(clazz);
        System.out.println(clazz2);
//        Class clazz = User.class;

        User u = (User)clazz.newInstance();
        Method m = clazz.getMethod("add",null);
        m.invoke(u,null);
        System.out.println(clazz);
        System.out.println(clazz);

        /*Class clazz = Class.forName("fanshe.User");
        User user = (User) clazz.newInstance();
        Method m = clazz.getMethod("add",null);
        m.invoke(user,null);*/
    }

}
