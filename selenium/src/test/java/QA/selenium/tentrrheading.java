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
public class tentrrheading extends Locomotive {
    @Test
    public void testtentrrheading() throws Exception {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String winHandleBefore = driver.getWindowHandle();
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Give the Gift of Camping with a Tentrr Gift Card.')]")));
        String message1 = element1.getText();
        System.out.println(message1);
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("TENTRR")));
        String message6 = element6.getText();

        System.out.println(message6);
        driver.findElement(By.linkText("TENTRR")).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.link.link-how-it-works")));
        String message = element.getText();

        //print the pop-up message
        System.out.println(message);
        driver.findElement(By.cssSelector("div.link.link-how-it-works")).click();
        Thread.sleep(1000);
        /*WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//h1[contains(text(), 'A better way to camp...')]")));
        String message6 = element6.getText();

        //print the pop-up message
        System.out.println(message6);*/
        driver.findElement(By.cssSelector("div.icon-close-alt")).click();
        driver.findElement(By.cssSelector(".link.link-list-campsite")).click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".hosting-page-header")));
        String message5 = element5.getText();
        System.out.println(message5);
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='register-link']")));
        String message2 = element2.getText();

        //print the pop-up message
        System.out.println(message2);

        driver.findElement(By.xpath(".//*[@id='register-link']")).click();
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Sign up with')]")));
        String message4 = element4.getText();
        System.out.println(message4);
        String winHandleBefore1 = driver.getWindowHandle();
        Thread.sleep(1000);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));
        driver.findElement(By.cssSelector(".close")).click();
        driver.switchTo().window(winHandleBefore1);
        //driver.close();
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".profile-name")));
        String message3 = element3.getText();

        //print the pop-up message
        System.out.println(message3);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".profile-name")).click();
        WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".facebook-link.link")));
        String message7 = element7.getText();
        System.out.println(message7);
        WebElement element8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Forgot password?')] ")));;
        String message8 = element8.getText();
        System.out.println(message8);
        driver.findElement(By.cssSelector(".close")).click();
        driver.switchTo().window(winHandleBefore1);
        driver.close();
    }
}
