package CheckboxesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingCheckboxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");

        //xpath : //input[@class='form-check-input' and @type='checkbox']

        List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        for(WebElement checkbox : Checkboxes){
            checkbox.click();

        }
        Thread.sleep(3000);
        driver.quit();
    }
}
