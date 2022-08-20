package ReadExcelFile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelConfig
{
    XSSFWorkbook wb;
    XSSFSheet sheet1;
    public ExcelConfig(String excelpath)
    {
        try {
            File src = new File(excelpath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);

             }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetnumber,int row,int column)
    {
        sheet1 = wb.getSheetAt(sheetnumber);
       String data= sheet1.getRow(row).getCell(column).getStringCellValue();
       return data;
    }

    public int getRowCount(int sheetIndex)
    {
       int row= wb.getSheetAt(sheetIndex).getLastRowNum();
       row=row+1;
       return  row;
    }

}

