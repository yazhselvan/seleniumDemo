package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;


public class waitMethodsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Explicit Wait


//Declaration
//        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Fluent Wait
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);




        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize(); // --> Method chaining
//        Thread.sleep(3000);

//        WebElement orangeHRM = driver.findElement(By.linkText("OrangeHRM, Inc"));

        //Explicit wait usage
//        WebElement orangeHRM = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc"))));

        //Fluent wait usage
        WebElement orangeHRM = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.linkText("OrangeHRM, Inc"));
            }
        });

        orangeHRM.click();
        driver.quit();
    }
}
