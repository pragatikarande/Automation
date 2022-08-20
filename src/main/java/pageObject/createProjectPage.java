package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createProjectPage
{
    public WebDriver driver;
    // By email= By.id("user_email");
   // By login=By.xpath("//a[contains(text(),'LOGIN')]");
    By username=By.xpath("//input[@name='loginfmt']");
    By next=By.xpath("//input[@id='idSIButton9']");
    By cookies=By.xpath("//button[@id='onetrust-accept-btn-handler']");
    By createbtn=By.xpath("//a[contains(text(),'Create Project')]");
    By projectname=By.xpath("//input[@id='projectName']");
    By WBScode  =By.xpath("//button[contains(text(),'Look Up')]");
    By code=By.xpath("//span[contains(text(),'16300000-01-01-01-1000')]");
    By select=By.xpath("//button[contains(text(),'Select')]");
    By fiscalyear=By.xpath("//body/app-root[1]/div[1]/app-create-project[1]/div[1]/form[1]/div[5]/div[1]/div[1]/app-date-picker[1]/div[1]/input[1]");
    By calender=By.xpath("//body/app-root[1]/div[1]/app-create-project[1]/div[1]/form[1]/div[5]/div[1]/div[1]/app-date-picker[1]/div[1]/div[1]");





    public createProjectPage(WebDriver driver)
    {
        this.driver=driver;
    }


   /* public WebElement getLogin()
    {
        return driver.findElement(login);
    } */

    public WebElement getusername()
    {
        return driver.findElement(username);
    }

    public WebElement getNext()
    {
        return driver.findElement(next);
    }
    public WebElement getCookies()
    {
        return driver.findElement(cookies);
    }

    public WebElement getcreatebtn()
    {
        return driver.findElement(createbtn);

    }
    public WebElement getprojectname()
    {
        return driver.findElement(projectname);
    }
    public WebElement getWBSCode()
    {
        return driver.findElement(WBScode);
    }

     public WebElement getcode()
    {
        return driver.findElement(code);
    }

    public WebElement getSelect()
    {
        return driver.findElement(select);
    }

    public WebElement getfiscalyear()
    {
        return driver.findElement(fiscalyear);
    }

    public WebElement getcalender()
    {
        return driver.findElement(calender);
    }




}
