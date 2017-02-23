package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by monikapathak on 1/10/17.
 */
@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com//"
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
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(), 'Filters:')]")));
        String message = element.getText();
        System.out.println(message);
        driver.findElement(By.cssSelector("div.btn-search-page-filters-expand")).click();
        WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-count")));
        String message2 = element2.getText();
        System.out.println(message2);
        driver.findElement(By.cssSelector("li.filter-option-desktop.filter-li")).click();
        driver.findElement(By.cssSelector("div.btn-search-page-filters-expand")).click();
        WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='search-page']/div/div/div/div[1]/div[2]/div[1]")));
        String message3 = element3.getText();
        System.out.println(message3);
        driver.findElement(By.xpath(".//*[@id='search-page']/div/div/div/div[1]/div[2]/div[1]")).click();
        WebElement element4=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-count")));
        String message4 = element4.getText();
        System.out.println(message4);
        WebElement element5=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.select-label")));
        String message5 = element5.getText();
        System.out.println(message5);
        driver.findElement(By.cssSelector("div.select-label")).click();
        driver.findElement(By.cssSelector("li.option-price")).click();
        WebElement element6=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.select-label")));
        String message6 = element6.getText();
        System.out.println(message6);
        driver.findElement(By.cssSelector("div.select-label")).click();
        driver.findElement(By.cssSelector("li.option--price")).click();
        driver.findElement(By.cssSelector("div.select-label")).click();
        driver.findElement(By.cssSelector("li.option-location")).click();
        driver.findElement(By.xpath(".//div[contains(text(), 'Back to Top')]")).click();
        WebElement element7=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), 'Back to Top')]")));
        String message7 = element7.getText();
        System.out.println(message7);
    }

}
