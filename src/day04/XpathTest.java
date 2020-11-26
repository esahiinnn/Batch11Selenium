package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- Delete butonunun gorunur olmadigini test edin
 */
public class XpathTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2- Add Element butonuna basin
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButton.click();


        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
            if(deleteButton.isDisplayed()){
                System.out.println("Delete butonu gorunur");
            }else{
                System.out.println("Delete butonu gorunmez");
            }
        //4- Delete tusuna basin
        deleteButton.click();

        //5- Delete butonunun gorunur olmadigini test edin
            try{
                deleteButton.click();
            }catch(Exception e){
                System.out.println("Delete butonu yoktur");
        }
    }
}
