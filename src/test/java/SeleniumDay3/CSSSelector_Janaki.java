package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelector_Janaki {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        driver.findElement(By.cssSelector("input.form_input[type='password']")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("input.submit-button")).click();

        driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("span.shopping_cart_badge")).click();
        driver.findElement(By.cssSelector("button[data-test=\"checkout\"]")).click();
    }

}
