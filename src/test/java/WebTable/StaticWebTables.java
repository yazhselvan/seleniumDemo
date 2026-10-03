package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticWebTables {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Find number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
        System.out.println("rows count: "+ rows.size());

        //Find number of columns

        //use th to find the number of columns

        //Locate specific element in web table
//        String specificElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
//        System.out.println(specificElement);
        System.out.println(getSpecificElementData(6,3));
        driver.quit();

//        for(int r=2; r<=rows.size(); r++){
//            for(int c = 1; c<=columns.size(); c++){
//                WebElement specificElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+column+"]"));
//                System.out.println(specificElement.getText());
//            }
//        }

    }

    public static String getSpecificElementData(int row, int column){
        WebElement specificElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+column+"]"));
        return specificElement.getText();
    }
}
