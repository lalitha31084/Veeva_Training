package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationsPractice {
    public static void main(String [] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.className("gLFyf")).sendKeys("Nature Photos");
        driver.findElement(By.className("gLFyf")).submit();
        Thread.sleep(3000);
        driver.navigate().to("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("Lalitha31084");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.quit();
    }
}
