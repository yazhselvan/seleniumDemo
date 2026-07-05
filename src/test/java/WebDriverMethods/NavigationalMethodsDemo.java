package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class NavigationalMethodsDemo {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://www.amazon.in");

        URL myURL = new URL("https://www.amazon.in");
        driver.navigate().to(myURL);


        driver.navigate().back();
        System.out.println("After navigating back : " + driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println("After navigating forward: " +driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println("After refresh: "  + driver.getCurrentUrl());
        driver.quit();




    }
}
