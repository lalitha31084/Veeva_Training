
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleTest {
    public void SingleWindowHandle(WebDriver driver, String parentWindow) throws InterruptedException {

        // Single Window
        System.out.println("Parent Window Handle: " + parentWindow);
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                driver.findElement(By.id("firstName")).sendKeys("Lalitha");
                Thread.sleep(3000);
                System.out.println("Child Window Handle: " +windowHandle + " " + driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
    }

    public void SingleTabHandle(WebDriver driver, String parentWindow) throws InterruptedException {
        // Single Tab
        System.out.println("Parent Window Handle: " + parentWindow);
        driver.findElement(By.id("newTabBtn")).click();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                driver.findElement(By.id("alertBox")).click();
                System.out.println("Child Tab Handle: " + windowHandle + " " + driver.getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentWindow = driver.getWindowHandle();
        WindowHandleTest obj = new WindowHandleTest();

        // Single Window
        obj.SingleWindowHandle(driver, parentWindow);
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("name")).sendKeys("Devi");
        Thread.sleep(3000);

        // Single Tab
        obj.SingleTabHandle(driver, parentWindow);
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        driver.quit();
    }
}
