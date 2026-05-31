package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Priyanka {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("problem_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input.submit-button")).click();
        driver.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.cssSelector("span.shopping_cart_badge[data-test='shopping-cart-badge']")).click();
        driver.findElement(By.cssSelector("button#checkout")).click();
        driver.quit();
    }
}





