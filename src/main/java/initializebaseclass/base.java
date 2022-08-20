package initializebaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class base
{
    public Properties prop;
    public WebDriver driver;
    public <createProjectTest> WebDriver initializeDriver() throws IOException
    {

        prop=new Properties();
        FileInputStream fis=new FileInputStream("/Users/prkarande/Downloads/Academy/src/main/java/resources/data.properties");
        prop.load(fis);
        String browserName= prop.getProperty("browser");

         if(browserName.equals("chrome"))

          {
           //execute in chrome browser
           System.setProperty("webdriver.chrome.driver","/Users/prkarande/Downloads/SeleniumAutomationPractice/chromedriver");
            driver=new ChromeDriver();


           }
           else if (browserName.equals("firefox"))
           {
        //execute in firefox
           }
           else
           {
              // execute in IE

           }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    return driver;



        }



}
