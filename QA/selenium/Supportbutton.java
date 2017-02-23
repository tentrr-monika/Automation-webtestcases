package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by monikapathak on 1/16/17.
 */


@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)
public class Supportbutton extends Locomotive {

    @Test
    public void testSupportButton() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Embed']/div/span[2]")));
        //driver.findElement(By.xpath("html/body/div[12]/div/div[2]/div/div/div[1]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("html/body/div/div/div[4]/div")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Monik pathak");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("monika");
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("I need help in booking");
        driver.findElement(By.xpath("//div[@id='content']/div/label[2]/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='content']/div/label[2]/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='content']/div/label[2]/div[2]")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("monika@tentrr.com");
        driver.findElement(By.xpath("//input[@value='Send']")).click();
        //*[@id='Embed']/div/span[2]
    }
}