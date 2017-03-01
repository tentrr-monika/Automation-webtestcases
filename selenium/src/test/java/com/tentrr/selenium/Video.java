//test case is to verify "watch out video link works on homegae
package com.tentrr.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.String;

@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"
)
public class Video extends Locomotive {
    @Test
    public void testVideo() throws Exception {

        WebElement myAccount = driver.findElement(By.id("link-watch-video"));

        //Test will only continue, if the below statement is true

        //This is to check whether the link is displayed or not

        Assert.assertTrue(myAccount.isDisplayed());

        //My Account will be clicked only if the above condition is true

        myAccount.click();
        //driver.getPageSource().contains("Watch our video");
        driver.findElement(By.id("link-watch-video")).click();
        System.out.println("It worked");

        //driver.findElement(By.xpath(".//*[@id='player']/div[5]/div[2]/button")).click();
        //driver.findElement(By.xpath(".//*[@id='video-stop-overlay']/div/a")).click();

    }
}
