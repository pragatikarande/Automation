package ReadExcelFile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel1
{

    public static void main(String[] args) throws IOException {
        File src=new File("/Users/prkarande/Documents/demodata1.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet1=wb.getSheetAt(0);
       int rowcount= sheet1.getLastRowNum();
       System.out.println("Total rows count is "+rowcount);

       for(int i=0;i<rowcount;i++)
       {
           String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
           System.out.println("Test data from excel is"+data0);

       }
        



    }
}
