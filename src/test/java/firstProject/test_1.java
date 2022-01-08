package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class test_1 {

    WebDriver wd;

    @BeforeMethod
    public void preConditions(){

        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com");
    }

    @Test
    public void testName1(){

        WebElement el1 = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        //WebElement el3 = wd.findElement(By.className("btn btn-sm btm-link"));
        //WebElement link = wd.findElement(By.linkText("Sign Up"));
        //WebElement partLink = wd.findElements(By.partialLinkText("Sign"));
        List<WebElement> ael = wd.findElements(By.tagName("a"));
        System.out.println(ael.size());
    }

    @AfterMethod

    public void close(){

        //wd.close();
        //wd.quit();
    }

}
