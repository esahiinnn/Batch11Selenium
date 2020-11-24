package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Youtube ana sayfasina gidelim https://youtube.com
        driver.navigate().to("https://youtube.com");

        //Amazon ana sayfasina gidelim https://amazon.com
        driver.navigate().to("https://amazon.com");

        //Tekrar Youtube sayfasina donelim
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //Sayfayi tam ekran yapalim
        driver.manage().window().maximize();

        //Thread.sleep Ekrana bekleme suresi ekleme
        Thread.sleep(5000);

        driver.close();
    }
}
