package DropdownsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement countryDropDown = driver.findElement(By.xpath("//select[@id='country']"));
        Select countryDDSelect = new Select(countryDropDown);
//        countryDDSelect.selectByVisibleText("United Kingdom");
//        countryDDSelect.selectByValue("germany");
//        countryDDSelect.selectByIndex(1);

        List<WebElement> TotalCountries = countryDDSelect.getOptions();
//        System.out.println(TotalCountries.size());

        //EnhancedForLoop
        //for(DataType <name> : <Listname>)
        for(WebElement Country : TotalCountries){
            System.out.println(Country.getText());
        }

    }
}
