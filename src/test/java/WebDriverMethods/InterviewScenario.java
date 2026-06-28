package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InterviewScenario {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");

        driver.navigate().refresh();

        try{
            username.sendKeys("yazh");
        }catch (StaleElementReferenceException e){
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yazh");

        }


        driver.quit();

    }
}
