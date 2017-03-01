//TThis case is to verify the tentrr heading on the homepage
package com.tentrr.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import io.ddavison.conductor.Config;
import org.junit.Test;
import org.openqa.selenium.By;

@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"
)
public class tentrrheading extends Locomotive {
    @Test
    public void testtentrrheading() throws Exception {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String winHandleBefore = driver.getWindowHandle();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Give the Gift of Camping with a Tentrr Gift Card.')]")));
        String message = element.getText();
        System.out.println(message);
        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();

        driver.switchTo().window(winHandleBefore);
        Thread.sleep(2000);
        driver.findElement(By.linkText("TENTRR")).click();

        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.link.link-how-it-works")));
        String message4 = element4.getText();

        //print the pop-up message
        System.out.println(message4);
        driver.findElement(By.cssSelector("div.link.link-how-it-works")).click();
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//h1[contains(text(), 'A better way to camp...')]")));
        String message1 = element1.getText();

        //print the pop-up message
        System.out.println(message1);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.icon-close-alt")).click();
        //driver.findElement(By.xpath("//*[@id='static-header']/div/nav/div[2]")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[12]/div/div[2]/div/div/div[1]/button")));
        //driver.findElement(By.xpath("html/body/div[12]/div/div[2]/div/div/div[1]/button")).click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='register-link']")));
        String message2 = element2.getText();

        //print the pop-up message
        System.out.println(message2);

        driver.findElement(By.xpath(".//*[@id='register-link']")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        String winHandleBefore1 = driver.getWindowHandle();
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Sign up with')]")));
        String message3 = element3.getText();

        //print the pop-up message
        System.out.println(message3);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));
        driver.findElement(By.xpath("//span[contains(text(), '×')]/following::div/div[1]/button")).click();
        driver.switchTo().window(winHandleBefore1);
        //driver.close();
        /*WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".profile-name")));
        String message3 = element4.getText();

        //print the pop-up message
        System.out.println(message3);*/

        driver.findElement(By.cssSelector(".profile-name")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //String winHandleBefore1 = driver.getWindowHandle();
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));
        driver.findElement(By.xpath("//span[contains(text(), '×')]/following::div/div[1]/button")).click();
        driver.switchTo().window(winHandleBefore1);
        driver.close();
    }
}
