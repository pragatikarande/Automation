package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyCoursePage
{
    public WebDriver driver;

   // By course= By.linkText("Courses");
    By course=By.xpath("//a[contains(text(),'Courses')]");
    By login=By.xpath("//a[contains(text(),'Login')]");
    By username=By.id("email");
    By Password=By.name("password");
    //By Login=By.name("commit");
    By Login =By.xpath("//body/main[1]/div[1]/form[1]/div[4]/input[1]");





    public BuyCoursePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getCourse()
    {
        return driver.findElement(course);
    }
    public WebElement getLogin()
    {
        return driver.findElement(login);
    }
    public WebElement enterUsername()
    {
    return driver.findElement(username);
    }

    public WebElement enterPassword()
    {
        return driver.findElement(Password);
    }
    public WebElement clickLogin()
    {
        return driver.findElement(Login);
    }







}
