package practice.序列化;


import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            SerializeUser();
            DeSerializeUser();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void SerializeUser() throws IOException {
        User user = new User();
        user.setUsername("ddd");
        user.setPassword("bbb");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\data.txt"));
        outputStream.writeObject(user);
        outputStream.close();
        System.out.println("普通字段序列化：username=  "+user.getUsername());
        System.out.println("添加了transient关键字序列化：password=  "+user.getPassword());
    }
    //反序列化
    private static void DeSerializeUser() throws IOException, ClassNotFoundException {
        File file = new File("D:/data.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User user = (User)ois.readObject();
        System.out.println("普通字段反序列化：username=  "+user.getUsername());
        System.out.println("添加了transient关键字反序列化：password=  "+user.getPassword());
    }
}
class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;//transient关键字屏蔽序列化

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
