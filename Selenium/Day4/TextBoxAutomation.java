package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;;

public class TextBoxAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/elements");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
//      driver.findElement(By.linkText("Text Box")).click();
        driver.findElement(By.className("text")).click();
        driver.findElement(By.id("userName")).sendKeys("Lalitha");
        driver.findElement(By.id("userEmail")).sendKeys("Lalitha123@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Bhupalapatnam");
        driver.findElement(By.id("permanentAddress")).sendKeys("Hyderabad");
        driver.findElement(By.id("submit")).click();

    }
}
