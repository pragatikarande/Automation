package Academy;

import initializebaseclass.base;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WordpressLogin
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
                    Object[][] data= new Object[3][2];
                    data[0][0]="admin1";
                    data[0][1]="demo1";

                    data[1][0]="admin2";
                    data[1][1]="demo2";

                    data[2][0]="admin3";
                    data[2][1]="demo3";


                    return data;
                }
}
