//This test case verifying the featured site on homepage

package com.tentrr.selenium;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;


/**
 * Created by De on 1/9/17.
 */

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
        url     = "https://www.tentrr.com/"
)

public class featuredsites extends Locomotive {

    @Test
    public void testF() throws Exception {

        //driver.findElement(By.xpath("(//button[@type='button'])[2]")).click(); //*[@id="homepage-slider"]/div/div/div/button[2]
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();

        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.control-arrow.control-next")));
        String message = element.getText();
        System.out.println(message);
        driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.control-arrow.control-next")));
        String message1 = element1.getText();
        System.out.println(message1);
        driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
        WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.control-arrow.control-next")));
        String message2 = element2.getText();
        System.out.println(message2);
        driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
        WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.control-arrow.control-next")));
        String message3 = element3.getText();
        System.out.println(message3);
        driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
        driver.findElement(By.cssSelector("li.slide.slide-1 > div > div.carousel-site > div.carousel-site-text > p.carousel-site-link > a")).click();

    }
}
