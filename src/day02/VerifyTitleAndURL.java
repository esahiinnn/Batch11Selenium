package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //PAGE TITLE TEST
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String actualResult = driver.getTitle();
        String expectedResult = "google";

        if(actualResult.equals(expectedResult)){
            System.out.println("Page Title testi PASSED");
        }else{
            System.out.println("Page Title testi FAILLED");
            System.out.println("Actual Page Title:" + actualResult);
        }

        //URL TEST
        driver.navigate().to("https://youtube.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.youtube.com";
            if(actualURL.equals(expectedURL)){
                System.out.println("URL test PASSED");
            }else{
                System.out.println("URL test FAILED");
                System.out.println("Actual URL: " + actualURL);
            }

        driver.close();

    }

}
