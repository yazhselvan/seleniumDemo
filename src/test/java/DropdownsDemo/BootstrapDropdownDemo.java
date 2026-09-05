package DropdownsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdownDemo {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://davidstutz.github.io/bootstrap-multiselect/?utm_source=chatgpt.com/");
        driver.manage().window().maximize();

        WebElement DropDownBox = driver.findElement(By.xpath("(//div[@class='btn-group']/button[@title = 'None selected'])[1]"));
        new Actions(driver)
                .scrollToElement(DropDownBox)
                .perform();

        DropDownBox.click();
        SelectValueDropDown("tomatoes");
    }

    public static void SelectValueDropDown(String DDValue){
        WebElement SelectValue = driver.findElement(By.xpath("//input[@value='"+DDValue+"']"));
        SelectValue.click();
    }

    public static void getAllSelectValues(){
        List<WebElement> AllValues = driver.findElements(By.xpath("//input[contains(@id,'multiselect_') and @class='form-check-input']"));
        for(WebElement value : AllValues){
            System.out.println(value.getText());
        }
    }
}
