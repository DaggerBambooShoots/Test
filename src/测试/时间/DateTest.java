package 测试.时间;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        String endtime = getFormatDateTime(new Date(),"yyyy-MM-dd HH:mm:ss");
        Long beginlongtime = new Date().getTime() - 86400000;
        String begintime = getFormatDateTime(new Date(beginlongtime),"yyyy-MM-dd HH:mm:ss");
        String header = begintime.substring(0,8);
        String day = begintime.substring(8,10);
        String hour = begintime.substring(11,13);
        ArrayList<String> times = new ArrayList<>();
        for(int i =0;i<24;i++){
            Integer h = Integer.parseInt(hour)+1;
            if(h<10){
                hour="0"+h;
            }else if(h==24){
                day=Integer.parseInt(day)+1+"";
                hour="00";
            }else{
                hour=h+"";
            }
            times.add(header+day+" "+hour+":00:00");
        }
        for(String time : times){
            System.out.println(time);
        }
    }
    public static String getFormatDateTime(Date currDate, String format) {
        SimpleDateFormat dtFormatdB = null;
        try {
            dtFormatdB = new SimpleDateFormat(format);
            return dtFormatdB.format(currDate);
        } catch (Exception e) {
            dtFormatdB = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                return dtFormatdB.format(currDate);
            } catch (Exception ex) {
            }
        }
        return null;
    }
}
