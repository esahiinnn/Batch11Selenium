package day04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
            1. Bir class oluşturun : Locators_css2.
            Main method oluşturun ve aşağıdaki görevi tamamlayın.
            a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
            b.Locate email textbox
            c. Locate password textbox ve
            d. Locate signin button
            e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesinitıklayıniz.
            Username : testtechproed@gmail.comii.
            Password : Test1234!
            NOT: cssSelector kullanarak elementleri locate ediniz.
 */
public class CssLocatorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // b.Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("input[type='email']"));
        String username = "testtechproed@gmail.com";

        // c. Locate password textbox ve
        WebElement passwordtextBox = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String password = "Test1234!";

        // d. Locate signin button
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));


        /* e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesinitıklayıniz.
                    Username : testtechproed@gmail.com
                    Password : Test1234!   */
        emailTextBox.sendKeys(username);
        passwordtextBox.sendKeys(password);
        signInButton.click();
    }
}
