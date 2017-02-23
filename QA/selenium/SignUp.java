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
public class SignUp extends Locomotive{
    @Test
    public void testSignUp() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
       driver.switchTo().window(winHandleBefore);

        driver.findElement(By.id("register-link")).click();
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Camper Q&A')]")));
        String message1 = element1.getText();
        System.out.println(message1);
        driver.findElement(By.xpath("(//input[@id='full_name'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='full_name'])[2]")).sendKeys("Mary Jane");
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Sign up')]")));
        String message2 = element2.getText();
        System.out.println(message2);
        driver.findElement(By.xpath("//div[contains(text(), 'Sign up')]")).click();
        //driver.findElement(By.className("form-group submit-group")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa1.tentrr");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Tentrr4qa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(), 'Sign up')]")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa175.tentrr@mailinator.com");
        driver.findElement(By.xpath("//div[contains(text(), 'Sign up')]")).click();

    }

}