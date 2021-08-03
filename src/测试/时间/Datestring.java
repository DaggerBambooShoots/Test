package 测试.时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Datestring {
    public static void main(String[] args) throws ParseException {
        System.out.println(new Date(1602596785000L));
        String time = getFormatDateTime(new Date(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(Integer.parseInt("02"));
        System.out.println(time);
        String a = time.substring(0,8);
        String b = time.substring(8,10);
        String c = time.substring(11,13);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Date aa = stringToDate("2020-01-01 00:00:00","yyyy-MM-dd HH:mm:ss");
        Date bb = stringToDate("2020-01-01 00:00:00","yyyy-MM-dd HH:mm:ss");
        System.out.println(aa.equals(bb));
        ArrayList bbb = new ArrayList<>();
        ArrayList ccc = new ArrayList<>();
        bbb.add(1);
        ccc.add("1");
        System.out.println(bbb.equals(ccc));
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

    public static Date stringToDate(String strTime, String formatType) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        date = formatter.parse(strTime);
        return date;
    }

    //
    public static  String getmonth(Date date){
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(ft.format(calender.getTime()));
        String year = calender.get(Calendar.YEAR)+"";
        int month = calender.get(Calendar.MONTH);
        String lastmonth=month>=10?month+"":"0"+month;
        String day = calender.get(Calendar.DATE)+"";
        String now = year+"-"+lastmonth+"-"+day;
        System.out.println("last:"+now);
        return now;
    }

    public static Integer getFirst(Date date){

        Calendar calendar=Calendar.getInstance();
        //获得当前日期往后推1个月 amount 为设置的月份值 +为往后推  +号可以省略  -为往前推
        calendar.setTime(date);//year,month,0
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        calendar.set(year,month,0);
        //获得下一个月有多少天
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月有"+day+"天");
        return day;
    }
    public static String getFirstDayofmonth(){
        Calendar cal = Calendar.getInstance();
        int firstDay = cal.getMinimum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, firstDay);
        return getFormatDateTime(cal.getTime(), "yyyy-MM-dd")+" 00:00:00.0";
    }

}
