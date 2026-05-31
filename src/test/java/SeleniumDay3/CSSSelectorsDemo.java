package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelectorsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //2. Open URL "https://www.saucedemo.com/"
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //maximizes the window

        //tagname#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        // tagname[attribute = 'value']
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");

        //tagname.classname[attribute = 'value']
        driver.findElement(By.cssSelector("input.form_input[type='password']")).sendKeys("secret_sauce");
        //tagname.classname
        driver.findElement(By.cssSelector("input.submit-button")).click();
    }
}
