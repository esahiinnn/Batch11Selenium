package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        //driver.close(); sadece calisilan browser'i kapatir
        driver.quit(); // acik olan tum browser'lari kapatir

    }
}
