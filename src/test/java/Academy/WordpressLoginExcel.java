package Academy;

import ReadExcelFile.ExcelConfig;
import Utilities.ExcelDataConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WordpressLoginExcel
{


    @Test(dataProvider = "Wordpressdata")
    public void Logintowordpress(String username,String password) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","/Users/prkarande/Downloads/SeleniumAutomationPractice/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://wordpress.com/log-in/");
        driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());

        driver.quit();
    }

    @DataProvider(name = "Wordpressdata")
            public Object[][] passData()
                {
                   // ExcelConfig config=new ExcelConfig("/Users/prkarande/Downloads/Academy/src/test/java/ExcelData/demodata1.xlsx");
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
