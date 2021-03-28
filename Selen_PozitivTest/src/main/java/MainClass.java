import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/user/IdeaProjects/testselenium/drivers/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/user/IdeaProjects/testselenium/drivers/chromedriver");
        System.setProperty("phantomjs.binary.path", "/Users/user/IdeaProjects/testselenium/drivers/phantomjs-2.1.1-macosx/bin/phantomjs");
        WebDriver driver = new FirefoxDriver();
        driver.manage();
        driver.get("https://www.w3schools.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id='w3loginbtn']"));
        if (buttonLogin.getText().equals("LOG IN")){
            System.out.println("Наименование кнопки LOG IN верное");
            buttonLogin.click();
        }
        else System.out.println("Имя кнопки LOG IN неверное");

        WebElement buttonSignUp = driver.findElement(By.xpath("//div[@class='_yDlxv']//*[text()=' Sign up']"));
        if (buttonSignUp.getText().equals("Sign up")){
            System.out.println("Наименование кнопки SignUp верное");
            buttonSignUp.click();
        }
        else System.out.println("Имя кнопки SignUp неверное");

        
    }
}