package be.codekata.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EuroTest {
    @Test
    public void name() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.google.be/");

        String googleTile = driver.getTitle();
       assertEquals("Google",googleTile);
        driver.quit();
        //
    }

    /*@Test
    public void oef2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        // Launch Website
        driver.get("https://www.google.be/");
        driver.findElement(By.id("L2AGLb")).click();

        driver.findElement(By.name("q")).sendKeys("eurofins");
        driver.findElement(By.name("btnK")).submit();


        String eersteText ;
        //eersteText = driver.findElement(By.xpathnaamvaneerstewatjevind).getText();

        //googleresultpage =


        assertEquals("Resillion-home",eersteText);
        driver.quit();
    }
     */
    @Test
    public void examen(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gebruiker\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.google.be/");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("gazet van antwerpen");
        driver.findElement(By.name("btnK")).submit();
        driver.findElement(By.className("yuRUbf")).click();
        driver.findElement(By.id("didomi-notice-agree-button")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/header/div[1]/nav/ul[1]/li[3]/a")).click();
        String artikel = driver.findElement(By.xpath("/html/body/div[5]/div/div/main/div/div[2]/div/div/div[1]/div/div/div/a/div/div/div/h1")).getText();
        assertEquals("KVM-coach Defour rekent zich nog niet rijk tegen Zulte Waregem: “Maar wel logisch dat we aan de bekerfinale denken”",artikel);

        driver.quit();
    }


}
