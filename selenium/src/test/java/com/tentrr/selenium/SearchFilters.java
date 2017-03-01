//This test case verify
package com.tentrr.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Locomotive;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by monikapathak on 1/10/17.
 */
@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"
)
public class SearchFilters extends Locomotive {
    @Test
    public void testSearchFilters() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.xpath(".//*[@id='default-homepage-hero']/div/a")).click();

        driver.findElement(By.cssSelector("div.btn-search-page-filters-expand")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("li.filter-option-desktop.filter-li")).click();
        driver.findElement(By.cssSelector("div.btn-search-page-filters-expand")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='search-page']/div/div/div/div[1]/div[2]/div[1]")).click();
        driver.findElement(By.cssSelector("div.select-label")).click();
        driver.findElement(By.cssSelector("li.option-price")).click();
        driver.findElement(By.cssSelector("div.select-label")).click();
        driver.findElement(By.cssSelector("li.option--price")).click();
        driver.findElement(By.cssSelector("div.select-label")).click();
        driver.findElement(By.cssSelector("li.option-location")).click();
        driver.findElement(By.xpath(".//div[contains(text(), 'Back to Top')]")).click();

    }

}
