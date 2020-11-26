package day03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
1. Bir class oluşturun: LocatorsIntro
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
 a. http://a.testaddressbook.com adresine gidiniz.
  b. Sign in butonuna basin
 c. email textbox,password textbox, and signin button elementlerini locate ediniz..
 d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
 i. Username : testtechproed@gmail.com
 ii. Password : Test1234!
 e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
 f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
 doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.
 */

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        // 1. Bir class oluşturun: LocatorsIntro
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //      a. http://a.testaddressbook.com adresine gidin, sayfayi tamsayfa yapin.
        driver.get("http://a.testaddressbook.com");

        //      b. Sign in butonuna basin
        // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        //      c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.name("commit"));

        //      d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //              i. Username : testtechproed@gmail.com
        //              ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        //      e. Kullanici girisinin basarili olup olmadigini dogrulayin(verify)

        WebElement userName = driver.findElement(By.className("navbar-text"));
            if(userName.isDisplayed()){
                System.out.println("Kullanici girisi basarili");
            }else{
                System.out.println("Kullanici girisi basarisiz");
            }
        //      f. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        String expectedEmail = "testtechproed@gmail.com";

            if(userName.getText().equals(expectedEmail)){
                System.out.println("Kullanici adi testtechproed@gmail.com PASS");
            }else{
                System.out.println("Kullanici adi testtechproed@gmail.com degil FAILED");
                System.out.println(userName.getText());
            }


        //      g. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
        //              doğrulayin(verify).
        WebElement addressesLink = driver.findElement(By.linkText("Addresses"));
        WebElement signOutLink = driver.findElement(By.linkText("Sign out"));

            if(addressesLink.isDisplayed() && signOutLink.isDisplayed()){
                System.out.println("Adresses ve Sign Out textleri goruntulenmistir");
            }else{
                System.out.println("Adresses ve Sign Out textleri goruntulenmemistir");
            }

        //      h. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada " + linkListesi.size() + " tane link vardir");
        for (WebElement w:linkListesi) {
            System.out.println(w.getText());
        }

        //      i. driver'i kapatin
        driver.close();
    }
}
