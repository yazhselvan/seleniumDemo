package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
1. Open browser
2. Open Amazon web app
3. Get title of Amazon web app
4. Print the title
5. Close the browser
 */
public class FirstTestCase {
    public static void main(String[] args) {

    //1. Open browser
        WebDriver driver = new EdgeDriver();
//2. Open Amazon web app
        driver.get("https://www.saucedemo.com"); //get(string url) --> this method will open the web URL
        //specified in the parameter

        //3. Get title of Amazon web app
        String WebPageTitle = driver.getTitle();
//        4. Print the title
        System.out.println(WebPageTitle);
        //5. Close the browser
        driver.close();

    }


}
