package selenium;

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
        url     = "https://stage.tentrr.com/"
)
public class tentrrheading extends Locomotive {
    @Test
    public void testtentrrheading() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.linkText("TENTRR")).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.link.link-how-it-works")));
        String message = element.getText();

        //print the pop-up message
        System.out.println(message);
        driver.findElement(By.cssSelector("div.link.link-how-it-works")).click();
        driver.findElement(By.cssSelector("div.icon-close-alt")).click();
        //driver.findElement(By.xpath("//*[@id='static-header']/div/nav/div[2]")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[12]/div/div[2]/div/div/div[1]/button")));
        //driver.findElement(By.xpath("html/body/div[12]/div/div[2]/div/div/div[1]/button")).click();
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='register-link']")));
        String message1 = element1.getText();

        //print the pop-up message
        System.out.println(message1);

        driver.findElement(By.xpath(".//*[@id='register-link']")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        String winHandleBefore1 = driver.getWindowHandle();
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));
        driver.findElement(By.xpath("//span[contains(text(), '×')]/following::div/div[1]/button")).click();
        driver.switchTo().window(winHandleBefore1);
        //driver.close();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".profile-name")));
        String message2 = element2.getText();

        //print the pop-up message
        System.out.println(message2);

        driver.findElement(By.cssSelector(".profile-name")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //String winHandleBefore1 = driver.getWindowHandle();
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));
        driver.findElement(By.xpath("//span[contains(text(), '×')]/following::div/div[1]/button")).click();
        driver.switchTo().window(winHandleBefore1);
        driver.close();
    }
}
