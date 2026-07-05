package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandling1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        System.out.println("Parent window title"+driver.getTitle());

        Set<String> WindowHandles = driver.getWindowHandles(); //2

//        List<String> WindowsList = new ArrayList<>(WindowHandles);
//        String ParentID = WindowsList.get(0);
//        String ChildID = WindowsList.get(1);

        for(String WindowID : WindowHandles){//1 2
            String title = driver.switchTo().window(WindowID).getTitle();
            if(title.equals("OrangeHRM: All in One HR Software for Businesses | OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }

        }

        System.out.println(driver.getTitle());
        driver.quit();//OrangeHRM: All in One HR Software for Businesses | OrangeHRM


         //list {item1, item2, item3...}
        //      index0  index1  index2
    }
}
