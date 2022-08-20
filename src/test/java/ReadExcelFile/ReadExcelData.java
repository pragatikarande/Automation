package ReadExcelFile;

public class ReadExcelData
{

    public static void main(String[] args)
    {
        ExcelConfig excel=new ExcelConfig("/Users/prkarande/Documents/demodata1.xlsx");
        System.out.println(excel.getData(1,0,1));
    }
}
