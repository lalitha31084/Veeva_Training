package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPractice {
    public void single() throws InterruptedException{
        // Single Selection DropDowns
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        JavascriptExecutor js=(JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement w1=driver.findElement(By.id("course"));
        Select dropdown=new Select(w1);
        List< WebElement> alloptions=dropdown.getOptions();
        for(WebElement option:alloptions){
            System.out.println(option.getText());

        }
        dropdown.selectByIndex(1);
        Thread.sleep(3000);
        dropdown.selectByVisibleText("Javascript");
        Thread.sleep(3000);
        dropdown.selectByValue("net");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(dropdown.getAllSelectedOptions().get(0).getText());
        driver.quit();
    }
    public void multiple() throws InterruptedException{
        // Multiple Selection DropDowns
        WebDriver driver1=new EdgeDriver();
        driver1.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement w1=driver1.findElement(By.id("ide"));
        Select multipledropdowns=new Select(w1);
        List<WebElement>alloptions=multipledropdowns.getOptions();
        for(WebElement option:alloptions){
            System.out.println(option.getText());
        }
        multipledropdowns.selectByValue("vs");
        Thread.sleep(3000);
        multipledropdowns.selectByIndex(0);
        Thread.sleep(3000);
        multipledropdowns.selectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);

        multipledropdowns.deselectByIndex(0);
        Thread.sleep(3000);
        multipledropdowns.deselectByValue("vs");
        Thread.sleep(3000);
        multipledropdowns.deselectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);

    }
    public static void main(String[] args) throws InterruptedException{
         DropDownPractice dp=new DropDownPractice();
         dp.single();
         dp.multiple();
    }
}
