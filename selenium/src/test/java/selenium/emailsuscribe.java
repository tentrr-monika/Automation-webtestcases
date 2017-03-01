//This test case to verify the newsletter susctibe button work

package selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by monikapathak on 1/10/17.
 */

@Config(
        browser = Browser.CHROME,
        url     = "https://stage.tentrr.com/"
)
public class emailsuscribe extends Locomotive{
    @Test
    public void testemailsuscribe() throws Exception {
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("apple");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Your email is incorrect");
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Please enter an email address");
        driver.findElement(By.id("subscribe-form")).clear();
        driver.findElement(By.id("subscribe-form")).sendKeys("menu87@aol.com");
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
