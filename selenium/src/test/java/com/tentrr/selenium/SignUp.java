//test case is verify sign up button

package com.tentrr.selenium;

import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.By;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Test;



@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"
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
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("qa173.tentrr@mailinator.com");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

}