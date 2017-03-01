package selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by monikapathak on 1/10/17.
 */
@Config(
        browser = Browser.CHROME,
        url     = "https://stage.tentrr.com/"
)
public class Searchscreen extends Locomotive {
    @Test
    public void testSearchscreen() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        //driver.getPageSource().contains("EXPLORE SITES");
        driver.findElement(By.xpath(".//*[@id='default-homepage-hero']/div/a")).click();
        driver.findElement(By.cssSelector("input.input-search-start")).click();
        //driver.findElement(By.xpath("//div[@id='search-page']/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/div[3]/div[4]")).click();
        //driver.findElement(By.xpath("..//*[@id='search-page']/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[2]/div[2]/div[3]/div[4]/div[3]")).click();
        //driver.findElement(By.xpath(".//*[@id='search-page']/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[2]/div[2]/div[3]/div[4]/div[3]")).click();
        //driver.findElement(By.cssSelector("input.input-search-start")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")));
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
        driver.findElement(By.xpath(".//div[contains(text(), '29')]")).click();
        driver.findElement(By.xpath(".//div[contains(text(), '30')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.input-search-start")));
        driver.findElement(By.cssSelector("input.input-search-start")).click();
        driver.findElement(By.cssSelector("div.link.link-clear-dates")).click();
        driver.findElement(By.cssSelector("i.reservation-calendar-close.icon-close-alt")).click();
        Select dropdown= new Select(driver.findElement(By.cssSelector("select.search-page-campers")));
        dropdown.selectByValue("6");

    }

}
