package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage
{
    public WebDriver driver;
    //By email= By.id("user_email");
    //By register=By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]");
    By register=By.xpath("//span[contains(text(),'Register')]");
    By username=By.xpath("//input[@id='user_name']");
    By email=By.xpath("//input[@id='user_email']");
    By pwd=By.xpath("//input[@id='password']");
    By agree=By.xpath("//body/main[1]/div[1]/form[1]/div[4]/div[1]/input[2]");
    By signup=By.xpath("//body/main[1]/div[1]/form[1]/div[6]/input[1]");
    By login=By.xpath("//a[contains(text(),'Login')]");
    By mandatoryfielderrormsg=By.xpath("//div[contains(text(),'Please fill in all the fields.')]");
    By requiredfielderror=By.xpath("//body/main[1]/div[1]/form[1]/div[1]/div[1]");




    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
    }


    public WebElement getRegister()
    {
        return driver.findElement(register);

    }
    public WebElement getUsername()
    {
        return driver.findElement(username);
    }
    public WebElement getEmail()
    {
        return driver.findElement(email);
    }

     public WebElement getPassword()
    {
        return driver.findElement(pwd);
    }


    public WebElement getAgree()
    {
        return driver.findElement(agree);
    }


    public WebElement signup()
 {
     return driver.findElement(signup);
 }
    public WebElement mandatoryfielderrormsg()
 {
     return driver.findElement(mandatoryfielderrormsg);
 }
    public WebElement getLogin()
    {
        return driver.findElement(login);
    }
    public WebElement getrequiredfielderror()
    {
        return  driver.findElement(requiredfielderror);
    }

}
