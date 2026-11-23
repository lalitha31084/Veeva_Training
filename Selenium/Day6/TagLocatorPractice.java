import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TagLocatorPractice {
    public static void main(String[] args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement w1=driver.findElement(By.tagName("H1"));
        System.out.println(w1.getText());

    }
}
