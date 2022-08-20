package ReadExcelFile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel
{

    public static void main(String[] args) throws IOException {
        File src=new File("/Users/prkarande/Documents/demodata1.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet1=wb.getSheetAt(0);
        String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
        String data1=sheet1.getRow(1).getCell(1).getStringCellValue();
        String data2=sheet1.getRow(2).getCell(0).getStringCellValue();
        String data3=sheet1.getRow(2).getCell(1).getStringCellValue();


        System.out.println("data from excel is"+data0);
        System.out.println("data from excel is"+data1);
        System.out.println("data from excel is"+data2);
        System.out.println("data from excel is"+data3);




    }
}
