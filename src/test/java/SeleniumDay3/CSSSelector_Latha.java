package SeleniumDay3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Latha {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input.submit-button")).click();
        driver.findElement(By.xpath("//span[text()='OK']")).click();
        driver.findElement(By.cssSelector("div[data-test='inventory-item-name']")).click();
        driver.findElement(By.cssSelector("button#add-to-cart")).click();
        driver.findElement(By.cssSelector("button#checkout")).click();
        driver.quit();

    }
}

