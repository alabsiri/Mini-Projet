package Connexion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Connexion {
    public static WebDriver driver;
    @BeforeTest
    public void setup (){
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        System.out.println("La page est bien affiché");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void fermeture() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}