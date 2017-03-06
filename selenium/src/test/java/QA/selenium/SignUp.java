//test case is verify sign up button

package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)
public class SignUp extends Locomotive{
    @Test
    public  void testSignUp() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        driver.findElement(By.id("register-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='full_name'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='full_name'])[2]")).sendKeys("Mary Jane");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa1.tentrr");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Tentrr4qa");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("monika@tentrr.com");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        /*WebElement element5=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-next-step-delivery")));
        String message5 = element5.getText();
        System.out.println(message5);*/
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();

        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa177.tentrr@mailinator.com");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

}