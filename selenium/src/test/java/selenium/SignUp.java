package selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;


@Config(
        browser = Browser.CHROME,
        url     = "https://stage.tentrr.com/"
)
public class SignUp extends Locomotive{
    @Test
    public void testSignUp() throws Exception {
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        driver.findElement(By.id("register-link")).click();
       //driver.findElement(By.className("facebook-link link")).click();
        //driver.findElement(By.id("register-link")).click();
        //driver.findElement(By.xpath("//div[12]/div/div[2]/div/div/div[2]/form/div[5]/div")).click();
        //driver.findElement(By.xpath("//div[12]/div/div[2]/div/div/div[2]/form/p/span")).click();
        //driver.findElement(By.xpath("//div[12]/div/div[2]/div/div/div[2]/form/div[8]/span")).click();
        //driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[3]")).click();
        //driver.findElement(By.xpath("(//a[contains(text(),'Terms of Service')])[3]")).click();
        driver.findElement(By.xpath("(//input[@id='full_name'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='full_name'])[2]")).sendKeys("Mary Jane");
        driver.findElement(By.className("form-group submit-group")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa1.tentrr");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Tentrr4qa");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa172.tentrr@mailinator.com");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }

}