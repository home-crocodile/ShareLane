package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    //1. Open brouser

    @Test
    public void fillZipcodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        //driver.quit();

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        driver.findElement(By.name("first_name")).sendKeys("Alena");
        driver.findElement(By.name("last_name")).sendKeys("Harbunova");
        driver.findElement(By.name("email")).sendKeys("eshkimatreski@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("2222");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        //driver.quit();
    }
}
