package Academy;

import ReadExcelFile.ExcelConfig;
import Utilities.ExcelDataConfig;
import initializebaseclass.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.RegisterPage;

import java.io.IOException;

public class validateRegistrationExcel extends base
{

   @BeforeTest
    public void initialize() throws IOException
    {

        driver =initializeDriver();
        driver.get("http://qaclickacademy.com");
        //driver.get(prop.getProperty("url"));

    }

    //validate signup
   @Test(dataProvider = "registrationdata")
    public void Registeration(String username,String password) throws IOException, InterruptedException
   {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");
        RegisterPage rp=new RegisterPage(driver);
        System.out.println(password);
        rp.getRegister().click();
       rp.getUsername().sendKeys(username);
       rp.getPassword().sendKeys(password);
       System.out.println(driver.getTitle());

       driver.quit();

   }


    @AfterTest
    public void teardown()
    {
        driver.quit();
    }

    @DataProvider(name="registrationdata")
    public Object[][] passData()
    {

        ExcelConfig config1=new ExcelConfig("/Users/prkarande/Downloads/Academy/src/test/ExcelData/demodata1.xlsx");
        int rows=config1.getRowCount(0);
        System.out.println(rows);
        Object[][] data= new Object[rows][2];
        for (int i=0;i<rows;i++)
        {
            data[i][0]=config1.getData(0,i,0);
            data[i][1]=config1.getData(0,i,1);
        }

        return data;

    }



}

