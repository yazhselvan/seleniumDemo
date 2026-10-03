package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class FrameDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//        switch to Frame 1
        driver.switchTo().frame(Frame1);

        driver.findElement(By.xpath("//form[@name='name1']//input")).sendKeys("Hello");
//    switch to default content or parent window
        driver.switchTo().defaultContent();
        //switch to next frame
        WebElement Frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(Frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

    }
}
