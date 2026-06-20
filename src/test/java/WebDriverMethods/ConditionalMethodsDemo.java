package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //2. Open URL "https://www.saucedemo.com/"
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        boolean WikiDisplay = driver.findElement(By.xpath("//form[@id='Wikipedia1_wikipedia-search-form']/descendant::span/descendant::img")).isDisplayed();
        System.out.println("isDisplayed" + WikiDisplay);

        boolean NameEnablement = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
        System.out.println("isEnabled" + NameEnablement);

        WebElement maleRB = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement femaleRB = driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Default condition:");
        System.out.println("isSelected" + maleRB.isSelected()); //false
        System.out.println("isSelected" + femaleRB.isSelected()); //false

        maleRB.click();
        System.out.println("After selection:");
        System.out.println("isSelected" + maleRB.isSelected()); //true
        System.out.println("isSelected" + femaleRB.isSelected()); //false
        driver.close();
    }
}
