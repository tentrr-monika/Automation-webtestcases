package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)
public class Faqs extends Locomotive {
    @Test
    public void testFaq() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.findElement(By.linkText("FAQ")).click();
       // String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div/ul/li[1]/div/span")).click();

        //driver.findElement(By.xpath("/html/body/main/div/div[4]/div/ul/li[1]/div/span")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("a.more-questions-title")).click();
        driver.findElement(By.linkText("CAMPER Q&A")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.linkText("Pre-Trip")).click();
        driver.findElement(By.linkText("Post-Trip")).click();
        driver.findElement(By.linkText("Trust & Safety")).click();
        driver.findElement(By.linkText("Looking for CampKeeper Q&A?")).click();
        driver.findElement(By.cssSelector(".read-more-link")).click();
        driver.findElement(By.cssSelector(".read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.linkText("Payout")).click();
        driver.findElement(By.linkText("Profile & Booking")).click();
        driver.findElement(By.linkText("Campers: Before, during and after")).click();
        driver.findElement(By.linkText("Trust & Safety")).click();





    }

}
