//test case is to verify "watch out video link works on homegae
package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)
public class Video extends Locomotive {
    @Test
    public void testVideo() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='default-homepage-hero']/div/a")));
        String message = element.getText();
        System.out.println(message);
        //driver.getPageSource().contains("Watch our video");
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("link-watch-video")));
        String message1 = element1.getText();
        System.out.println(message1);
        driver.findElement(By.id("link-watch-video")).click();
        System.out.println("It worked");


    }
}
