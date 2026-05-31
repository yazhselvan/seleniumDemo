package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

/*
1. Launch browser
2. Open URL "https://www.saucedemo.com/"
3. Login using given username and password
4. Click Login
5. Homepage - ensure that homepage is opened
6. Close browser
 */
public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //1. Launch browser
        WebDriver driver = new EdgeDriver();

        //2. Open URL "https://www.saucedemo.com/"
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //maximizes the window
        //3. Login using given username and password

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement((By.className()))
        //4. Click Login
        driver.findElement(By.id("login-button")).click();



        //5. Ensuring the home page
        List<WebElement> products = driver.findElements(By.linkText("Products"));



        System.out.println("Number of products  " + products.size());

//        driver.close();
    }


}
