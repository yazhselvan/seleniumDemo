package SeleniumDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //2. Open URL "https://www.saucedemo.com/"
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //maximizes the window

        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
    }
}
