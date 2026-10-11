package PaginationWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PaginationTableDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testing.qaautomationlabs.com/web-table.php");
        driver.manage().window().maximize();

        String tableInfo = driver.findElement(By.id("tableInfo")).getText();
        //Showing 1 to 10 of 15 entries
        //Math.ceil --> 4.2 --> 5
        //substring(start, end)
        int maxEntriesInPage = Integer.parseInt(
                tableInfo.substring(tableInfo.indexOf("to ") + 3, tableInfo.indexOf(" of"))
        );

        int totalEntries = Integer.parseInt(
                tableInfo.substring(tableInfo.indexOf("of ") + 3, tableInfo.indexOf(" entries"))
        );
        int NumberOfPages = (int) Math.ceil(
                (double) totalEntries / maxEntriesInPage);

        for(int p=1; p<=NumberOfPages; p++){
            if(p>1){
                WebElement activePage = driver.findElement(By.xpath("//a[@data-page='"+p+"']"));
                activePage.click();
            }
        }
    }
}
