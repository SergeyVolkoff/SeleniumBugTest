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
        WebDriver driver = new FirefoxDriver();//будем работать в файрфоксе
        driver.manage();
        driver.get("https://www.w3schools.com/");// регистрацию будем проверять на этом сайте
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //добавим задержку
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id='w3loginbtn']"));
        if (buttonLogin.getText().equals("LOG IN")){ 
            System.out.println("Наименование кнопки LOG IN верное"); //проверяем что кнопка "наша"
            buttonLogin.click(); //наша - кликаем
        }
        else System.out.println("Имя кнопки LOG IN неверное"); //не наша - выводим оповещение в консоль

        WebElement buttonSignUp = driver.findElement(By.xpath("//div[@class='_yDlxv']//*[text()=' Sign up']"));
        if (buttonSignUp.getText().equals("Sign up")){
            System.out.println("Наименование кнопки SignUp верное");
            buttonSignUp.click();
        }
        else System.out.println("Имя кнопки SignUp неверное");

        driver.findElement(By.xpath("//input[@id='modalusername']")).sendKeys("lovsql@mail.ru");//в поле емаил вводим наши валидные данные
        driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("Qq123456");//в поле пароль вводимвалидный пароль
        WebElement buttonSignUpFree= driver.findElement(By.xpath("//div[@class='_20LW8']//*[text()='Sign up for free']"));
        if (buttonSignUpFree.getText().equals("Sign up for free")){ 
            System.out.println("Наименование кнопки Sign up for free верное"); //проверяем что кнопка "наша"
            buttonSignUpFree.click(); //наша - кликаем
        }
        else System.out.println("Имя кнопки Sign up for free  неверное"); 

    }
}