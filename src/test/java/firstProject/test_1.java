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
    public void testNew() {

        WebElement el1 = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el22 = wd.findElement(By.cssSelector("div"));
        WebElement el5 = wd.findElement(By.id("hero"));
        WebElement el52 = wd.findElement(By.cssSelector("#hero"));
        WebElement el3 = wd.findElement(By.className("font-weight-bold"));
        WebElement el33 = wd.findElement(By.cssSelector(".font-weight-bold"));

        //WebElement link1= wd.findElement(By.linkText("Sign Up"));
        WebElement link11= wd.findElement(By.cssSelector("[href='/login']"));

        //WebElement partLink = wd.findElements(By.partialLinkText("Sign"));
    }
    @Test
    public void test2(){

        List<WebElement> ael = wd.findElements(By.tagName("a"));
        System.out.println(ael.size());


    }

    @Test
    public void enterEmail(){

        WebElement el4 = wd.findElement(By.cssSelector("input[name='email']"));
        type(el4, "bunkof3@yandex.ru");

    }

    public void type(WebElement el4, String email) {
        el4.click();
        el4.clear();
        el4.sendKeys(email);
    }

    @AfterMethod

    public void close(){
        //wd.close();
        //wd.quit();
    }

}
