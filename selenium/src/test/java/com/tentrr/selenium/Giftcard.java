// Verifying the gift card feature

package com.tentrr.selenium;

import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.By;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.jvm.hotspot.runtime.Thread;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"
)
public class Giftcard extends Locomotive {
    @Test
    public void testGiftcard() throws Exception {
        driver.get(baseUrl + "/store/gift-card/");
        //driver.findElement(By.linkText("GIFT CARDS")).click();
        // Store the current window handle
        //String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
        /*for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }*/


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //print the pop-up message

        WebDriverWait wait = new WebDriverWait(driver, 30);
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=none | ]]

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btn-shop-now']")));
        //
        driver.findElement(By.xpath(".//*[@id='btn-shop-now']")).click();
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.findElement(By.xpath(".//label[contains(text(), '$100')]")).click();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), '28')]")));

        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.findElement(By.xpath(".//div[contains(text(), '28')]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ;
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-next-step-delivery")));
        driver.findElement(By.id("btn-next-step-delivery")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-next-step-payment")));
        driver.findElement(By.id("btn-next-step-payment")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println();
        // driver.findElement(By.xpath("//div[@id='gift-card-date-selector']/div/div/div/div[2]/div[3]/div[3]/div[4]")).click();
        driver.findElement(By.id("id_recipient_name")).clear();
        driver.findElement(By.id("id_recipient_name")).sendKeys("mary ann");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_recipient_email")));
        driver.findElement(By.id("id_recipient_email")).clear();
        driver.findElement(By.id("id_recipient_email")).sendKeys("aa");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_recipient_email")));
        driver.findElement(By.id("id_recipient_email")).clear();
        driver.findElement(By.id("id_recipient_email")).sendKeys("monika@tentrr.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.findElement(By.id("id_sender_name")).clear();
        driver.findElement(By.id("id_sender_name")).sendKeys("monika pathak");
        driver.findElement(By.id("id_sender_email")).clear();
        driver.findElement(By.id("id_sender_email")).sendKeys("pathakmonika@gmail.com");
        driver.findElement(By.id("id_message")).clear();
        driver.findElement(By.id("id_message")).sendKeys("Thank you!");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.findElement(By.id("id_shipping_name")).clear();
        driver.findElement(By.id("id_shipping_name")).sendKeys("Monika Pathak");
        driver.findElement(By.id("id_shipping_address")).clear();
        driver.findElement(By.id("id_shipping_address")).sendKeys("94-42 226st");
        driver.findElement(By.id("id_shipping_municipality")).clear();
        driver.findElement(By.id("id_shipping_municipality")).sendKeys("Floral Park");
        Select dropdown = new Select(driver.findElement(By.id("id_shipping_state")));
        dropdown.selectByValue("NY");
        driver.findElement(By.id("id_shipping_postal_code")).clear();
        driver.findElement(By.id("id_shipping_postal_code")).sendKeys("11001");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("id_shipping_phone_number")).clear();
        driver.findElement(By.id("id_shipping_phone_number")).sendKeys("917-536-4959");
        driver.findElement(By.id("id_payment_card_holder")).clear();
        driver.findElement(By.id("id_payment_card_holder")).sendKeys("Monika Pathak");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.findElement(By.id("id_payment_card_number")).clear();
        driver.findElement(By.id("id_payment_card_number")).sendKeys("4242424242424242");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        driver.findElement(By.id("id_payment_card_security_code")).clear();
        driver.findElement(By.id("id_payment_card_security_code")).sendKeys("678");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
        driver.findElement(By.id("btn-gift-card-submit")).click();
        List<WebElement> selectElements= driver.findElements(By.id("payment_terms_agreement"));
        if (!(driver.findElement(By.id("payment_terms_agreement")).isSelected()))
        {
            for (int i = 0; i < 1 ; i++)
            {
                try {
                    // to sleep 10 seconds
                    java.lang.Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // recommended because catching InterruptedException clears interrupt flag
                    java.lang.Thread.currentThread().interrupt();
                    // you probably want to quit if the thread is interrupted
                    return;
                }
                selectElements.get(i).click();
            }
        }
            try {
                // to sleep 10 seconds
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                // recommended because catching InterruptedException clears interrupt flag
                java.lang.Thread.currentThread().interrupt();
                // you probably want to quit if the thread is interrupted
                return;
            }//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_payment_terms_agreement")));
            //driver.findElement(By.id("id_payment_terms_agreement")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-gift-card-submit")));
            driver.findElement(By.id("btn-gift-card-submit")).click();

        }
    }


