package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PortalLoginAutomation
{
    public static void main( String[] args ) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.findElement(By.linkText("Login")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.name("roll_no")).sendKeys("23A91A6108");
        driver.findElement(By.name("password")).sendKeys("Lalitha@121813");
        driver.findElement(By.xpath("//button[@class='edu-btn btn-medium']")).click();

        Thread.sleep(5000);
        driver.quit();

    }
}
