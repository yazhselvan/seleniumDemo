package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthAlerts {
    public static void main(String[] args) {
        /*
        https://the-internet.herokuapp.com/basic_auth
        While hitting the above url, we will be getting an authentication pop up
        Username:
        Password:

        URL needs to be changed
        https://<username>:<password>@the-internet.herokuapp.com/basic_auth


         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        System.out.println(driver.findElement(By.xpath("//p")).getText());
    }
}
