package pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WebDriverDemo {


    public static void main (String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement buttonClick = driver.findElement(By.id("L2AGLb"));
        buttonClick.click();
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Afbeeldingen")));

        WebElement imagesLink = driver.findElements(By.linkText("Afbeeldingen")).get(0);
        imagesLink.click();
    }
}
