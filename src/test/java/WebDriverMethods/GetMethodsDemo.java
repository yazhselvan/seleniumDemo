package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethodsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //2. Open URL "https://www.saucedemo.com/"
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize(); //maximizes the window
        String title = driver.getTitle();
        Thread.sleep(5000);
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle); //3EE8663401BB8131190C7DCAFEAA15E3 //C7BBC12FD47DFAB979268A0A1610A9EB
        WebElement orangeHRM = driver.findElement(By.linkText("OrangeHRM, Inc"));
        orangeHRM.click();
        Set windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        //driver.close(); // close methods closes browser instance which is on focus
        driver.quit(); // closes the whole browser session


    }
}
