//This test case to verify the caleneder and # of of the camper on search screen

package com.tentrr.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by monikapathak on 1/10/17.
 */
@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"
)
public class Searchscreen extends Locomotive {
    @Test
    public void testSearchscreen() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);

        driver.findElement(By.xpath(".//*[@id='default-homepage-hero']/div/a")).click();
        driver.findElement(By.cssSelector("input.input-search-start")).click();

        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//div[contains(text(), '27')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//div[contains(text(), '28')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.input-search-start")).click();
        driver.findElement(By.cssSelector("div.link.link-clear-dates")).click();
        driver.findElement(By.cssSelector("i.reservation-calendar-close.icon-close-alt")).click();
        Select dropdown= new Select(driver.findElement(By.cssSelector("select.search-page-campers")));
        dropdown.selectByValue("6");

    }

}
