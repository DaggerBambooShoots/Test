package 测试.sftp;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;

import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Tt();
    }

    public static void Tt(){
        JSch jsch = new JSch();
        try {
            Session session = jsch.getSession("root", "192.168.221.128", 22);
            // 根据用户名，主机ip，端口获取一个Session对象
            // 如果服务器连接不上，则抛出异常
            if (session == null) {

            }///root/dispcc/wams

            session.setPassword("123456"); // 设置密码
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config); // 为Session对象设置properties
            session.setTimeout(1000); // 设置timeout时间
            session.connect(); // 通过Session建立链接

            ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp"); // 打开SFTP通道
            channelSftp.connect(); // 建立SFTP通道的连接
//            Vector vector = channelSftp.ls("/root/dispcc/wams");
            String sFilePattern = "^NM_20201028_\\d*_(wams_prifreq)\\.dt.tar.gz";
            final Pattern pattern = Pattern.compile(sFilePattern,Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
            Vector finalVector = new Vector();
            ChannelSftp.LsEntrySelector selector = new ChannelSftp.LsEntrySelector() {
                public int select(ChannelSftp.LsEntry entry) {
                    Matcher mtc = pattern.matcher(entry.getFilename());
                    SftpATTRS attrs = entry.getAttrs();
                    boolean isMatch = mtc.find() && !attrs.isDir() && !attrs.isLink();
                    if (isMatch) {
                        finalVector.add(entry);
                    }
                    return CONTINUE;
                }
            };
            channelSftp.ls("/root/dispcc/wams", selector);
            Vector vector = finalVector;
            for(Iterator ite = vector.iterator(); ite.hasNext();) {
                System.out.println(ite.next());
            }

            System.out.println("11111");
        }catch (Exception e){

        }
    }
}
