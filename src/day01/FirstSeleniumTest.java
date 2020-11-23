package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.get("https://amazon.com");
        driver.get("https://twitter.com");
        driver.close();

    }
}
