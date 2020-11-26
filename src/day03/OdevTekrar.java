package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
    1. Bir class oluşturun : YoutubeSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.youtube web sayfasına gidin. https://youtube.com/
        b. Search(ara) “Ed Sheeran you need me man i dont need you”
        c. “Karsiniza cikan ilk linke tiklayin” e tıklayın.
 */
public class OdevTekrar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //a.youtube web sayfasına gidin. https://youtube.com/
        driver.get("https://youtube.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // b. Search(ara) “Ed Sheeran you need me man i dont need you”
        WebElement youtubeSearch = driver.findElement(By.name("search_query"));
        String arananKelime = "Ed Sheeran you need me man i dont need you";
        youtubeSearch.sendKeys(arananKelime + Keys.ENTER);

        //c. “Karsiniza cikan ilk linke tiklayin” e tıklayın.
        WebElement ed = driver.findElement(By.linkText("Ed Sheeran - \"You Need Me, I Don't Need You\" captured in The Live Room"));
        ed.click();

    }
}
