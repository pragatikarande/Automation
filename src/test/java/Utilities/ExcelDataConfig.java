package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataConfig
{
    XSSFWorkbook wb;
    FileInputStream fis;
    XSSFSheet sheet1;

    public ExcelDataConfig(String excelPath)  {
        try {
            File src = new File(excelPath);
            try (FileInputStream fileInputStream = fis = new FileInputStream(src)) {
            }
            wb = new XSSFWorkbook(fis);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getData(int sheetnumber,int row,int column)
    {
        sheet1 = wb.getSheetAt(sheetnumber);
        String data=sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
    public int getRowCount(int sheetIndex)
    {
        int row;
        row = wb.getSheetAt(sheetIndex).getLastRowNum();
        row++;
         return row;
    }

}
