package 测试.scv文件读取.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ReadCSVFiletest {
    static String args=null;


    public static String getArgs() {
        return args;
    }

    public static void setArgs(String args) {
        ReadCSVFiletest.args = args;
    }
    private BufferedReader br = null;
    private List<String> list = new ArrayList<String>();
    public List<Map<String, String>> listD1 = new ArrayList<Map<String, String>>();
    public ReadCSVFiletest() throws Exception {
        listD1 = readD1();
    }

    public ReadCSVFiletest(String fileName) throws Exception {
        String myCharset = System.getProperty("file.encoding");
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream(new File(fileName)), "GBK");
        br = new BufferedReader(isr);
        String stemp;
        while ((stemp = br.readLine()) != null) {
            list.add(stemp);
        }
    }

    @SuppressWarnings("rawtypes")
    public List getList() {
        return list;
    }

    /**
     * 获取行数
     *
     * @return
     */
    public int getRowNum() {
        return list.size();
    }

    /**
     * 获取列数
     *
     * @return
     */
    public int getColNum() {
        if (!list.toString().equals("[]")) {
            if (list.get(0).toString().contains(",")) {// csv为逗号分隔文件
                return list.get(0).toString().split(",").length;
            } else if (list.get(0).toString().trim().length() != 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * 获取制定行
     *
     * @param index
     * @return
     */
    public String getRow(int index) {
        if (this.list.size() != 0) {
            return list.get(index);
        } else {
            return null;
        }
    }

    /**
     * 获取指定列
     *
     * @param index
     * @return
     */
    @SuppressWarnings("rawtypes")
    public String getCol(int index) {
        if (this.getColNum() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        String tmp = null;
        int colnum = this.getColNum();
        if (colnum > 1) {
            for (Iterator it = list.iterator(); it.hasNext();) {
                tmp = it.next().toString();
                sb = sb.append(tmp.split(",")[index] + ",");
            }
        } else {
            for (Iterator it = list.iterator(); it.hasNext();) {
                tmp = it.next().toString();
                sb = sb.append(tmp + ",");
            }
        }
        String str = new String(sb.toString());
        str = str.substring(0, str.length() - 1);
        return str;
    }

    /**
     * 获取某个单元格
     *
     * @param row
     * @param col
     * @return
     */
    public String getString(int row, int col) {
        String temp = null;
        int colnum = this.getColNum();
        if (colnum > 1) {
            temp = list.get(row).toString().split(",")[col];
        } else if (colnum == 1) {
            temp = list.get(row).toString();
        } else {
            temp = null;
        }
        return temp;
    }

    public List<Map<String, String>>  readD1() throws Exception {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        测试.scv文件读取.ReadCSVFiletest util = new 测试.scv文件读取.ReadCSVFiletest("D://c.csv");//       //PropConfigUtil.getInstance(args).csvOutpath()+"/a.csv"
        int rowNum = util.getRowNum();
        for (int i = 0; i < 1000; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("TP", util.getString(i, 0).replaceAll("\"", ""));
            map.put("IMP", util.getString(i, 1).replaceAll("\"", ""));
            map.put("MW", util.getString(i, 2).replaceAll("\"", ""));
            map.put("FDEM", util.getString(i, 3).replaceAll("\"", ""));
            map.put("FV1SPOR", util.getString(i, 4).replaceAll("\"", ""));
            map.put("GV2SPOR",
                    util.getString(i, 5).replaceAll("\"", ""));
            map.put("GV3SPOR", util.getString(i, 6).replaceAll("\"", ""));
            map.put("GV4SPOR", util.getString(i, 7).replaceAll("\"", ""));
            map.put("GV1PZ",
                    util.getString(i, 8).replaceAll("\"", ""));
            map.put("GV2PZ", util.getString(i, 9).replaceAll("\"", ""));
            map.put("GV3PZ", util.getString(i, 10).replaceAll("\"", ""));
            map.put("GV4PZ", util.getString(i, 11).replaceAll("\"", ""));
            list.add(map);
        }
        return list;
    }


}
