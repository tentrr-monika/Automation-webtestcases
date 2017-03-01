//This test case to verify the newsletter susctibe button work

package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.runtime.Thread;

/**
 * Created by monikapathak on 1/10/17.
 */

@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)
public class emailsuscribe extends Locomotive{
    @Test
    public void testemailsuscribe() throws Exception {
        java.lang.Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        java.lang.Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//p[contains(text(), 'We aim to take the hassle out of')]")));
        String message = element.getText();
        System.out.println(message);
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("apple");
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        String message1 = element1.getText();
        System.out.println(message1 + "button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Your email is incorrect");
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Please enter an email address");
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("menu87@aol.com");
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Already Registered");
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("alaka88@mailinator.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Already Registered");
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("qa22@mailinator.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Thank You");
    }

}
