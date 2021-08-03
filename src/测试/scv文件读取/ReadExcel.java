/*
package 测试.scv文件读取;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadExcel {
    public static void main(String[] args) throws IOException, BiffException {
        new ReadExcel().read();
    }

    public void read() throws IOException, BiffException {
        File Inputfile = new File("D:\\e.xls");
        FileInputStream fileInputStream = new FileInputStream(Inputfile);
        Workbook workbook = Workbook.getWorkbook(fileInputStream);

        Sheet readfirst = workbook.getSheet(0);
        int rows = readfirst.getRows();
        int clomns = readfirst.getColumns();
        System.out.println("row:" + rows);
        System.out.println("clomns:" + clomns);

        List<Map<String, String>> lists = new ArrayList<Map<String, String>>();
        for(int i =1;i<rows;i++) {
            Cell[] cells = readfirst.getRow(i); //循环得到每一行的单元格对象
            Map<String, String> map = new HashMap<String, String>();
            map.put("TP", cells[0].getContents());
            map.put("IMP", cells[1].getContents());
            map.put("MW", cells[2].getContents());
            map.put("FDEM", cells[3].getContents());
            map.put("FV1SPOR", cells[4].getContents());
            map.put("GV2SPOR", cells[5].getContents());
            map.put("GV3SPOR", cells[6].getContents());
            map.put("GV4SPOR", cells[7].getContents());
            map.put("GV1PZ", cells[8].getContents());
            map.put("GV2PZ", cells[9].getContents());
            map.put("GV3PZ", cells[10].getContents());
            map.put("GV4PZ", cells[11].getContents());
            lists.add(map);
        }
        for(Map<String, String> list:lists){
            System.out.println(list);
        }
    }
}
*/
