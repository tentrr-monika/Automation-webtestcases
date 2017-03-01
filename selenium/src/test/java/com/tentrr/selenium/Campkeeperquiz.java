//This case is verifying the positive on-boarding quiz flow

package com.tentrr.selenium;


import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@Config(
        browser = Browser.CHROME,
        url     = "https://www.tentrr.com/"

)
public class Campkeeperquiz extends Locomotive {


    @Test
    public void testCampkeeperquiz() throws Exception {
        driver.get(baseUrl + "/hosting/become-a-campkeeper/");
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn.btn-default")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn.btn-default.btn-onboarding-submit")).click();
        driver.findElement(By.xpath(".//*[@id='onboarding-email']")).clear();
        driver.findElement(By.xpath(".//*[@id='onboarding-email']")).sendKeys("qaa32.tentrr@mailinator.com");
        driver.findElement(By.cssSelector(".btn.btn-default.btn-onboarding-submit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onboarding-zip")));
        driver.findElement(By.id("onboarding-zip")).clear();
        driver.findElement(By.id("onboarding-zip")).sendKeys("12534");
        driver.findElement(By.cssSelector(".btn.btn-default.btn-onboarding-submit")).click();

        //question 1
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'I own about 15 acres (or more) of lovely land.')]/following::div[3]/div[1]")));
        if(driver.getPageSource().contains("I own about 15 acres (or more) of lovely land."))
        {
            System.out.println("First question pass");
        }
        else
        {
            System.out.println("Question 1 Fail");
        }
        driver.findElement(By.xpath("//p[contains(text(),'I own about 15 acres (or more) of lovely land.')]/following::div[3]/div[1]")).click();
        //question 2
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'The spot I have in mind for my campsite is private and secluded.')]/following::div[3]/div[1]")));
        if(driver.getPageSource().contains("The spot I have in mind for my campsite is private and secluded."))
        {
            System.out.println("Second question pass");
        }
        else
        {
            System.out.println("Question 2 Fail");
        }
        driver.findElement(By.xpath("//p[contains(text(),'The spot I have in mind for my campsite is private and secluded.')]/following::div[3]/div[1]")).click();

        //question 3

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(),'The spot I have in mind for my campsite is quiet.')]/following::div[3]/div[1]")));//*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("The spot I have in mind for my campsite is quiet."))
        {
            System.out.println("Third question pass");
        }
        else
        {
            System.out.println("Question 3 Fail");
        }
        driver.findElement(By.xpath(".//p[contains(text(),'The spot I have in mind for my campsite is quiet.')]/following::div[3]/div[1]")).click();
        //question 4

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'I can drive a car right up to the spot I have in mind for my campsite without much difficulty.')]/following::div[3]/div[1]")));
        if(driver.getPageSource().contains("I can drive a car right up to the spot I have in mind for my campsite without much difficulty."))
        {
            System.out.println("Fouth question pass");
        }
        else
        {
            System.out.println("Question 4 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'I can drive a car right up to the spot I have in mind for my campsite without much difficulty.')]/following::div[3]/div[1]")).click();
        //question 5
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'There is water on my property for campers to swim in.')]/following::div[3]/div[1]"))); //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("There is water on my property for campers to swim in."))
        {
            System.out.println("Fifth question pass");
        }
        else
        {
            System.out.println("Question 5 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'There is water on my property for campers to swim in.')]/following::div[3]/div[1]")).click();
        //question 6
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'There is a town nearby where campers can buy groceries and eat at a restaurant that I enjoy.')]/following::div[3]/div[1]")));  //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("There is a town nearby where campers can buy groceries and eat at a restaurant that I enjoy."))
        {
            System.out.println("6th question pass");
        }
        else
        {
            System.out.println("Question 6 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'There is a town nearby where campers can buy groceries and eat at a restaurant that I enjoy.')]/following::div[3]/div[1]")).click();
        //question 7
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'The spot I have in mind for my campsite has a fairly flat and clear area that is about half the size of a basketball court.')]/following::div[3]/div[1]"))); //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("The spot I have in mind for my campsite has a fairly flat and clear area that is about half the size of a basketball court."))
        {
            System.out.println("7th question pass");
        }
        else
        {
            System.out.println("Question 7 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'The spot I have in mind for my campsite has a fairly flat and clear area that is about half the size of a basketball court.')]/following::div[3]/div[1]")).click();
        //question 8
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'The spot I have in mind for my campsite has some shade for the tent.')]/following::div[3]/div[1]"))); //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("The spot I have in mind for my campsite has some shade for the tent"))
        {
            System.out.println("8th question pass");
        }
        else
        {
            System.out.println("Question 8 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'The spot I have in mind for my campsite has some shade for the tent.')]/following::div[3]/div[1]")).click();
        //9
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'I can think of three fun outdoor activities within a 20-minute drive.')]/following::div[3]/div[1]"))); //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("I can think of three fun outdoor activities within a 20-minute drive."))
        {
            System.out.println("9th question pass");
        }
        else
        {
            System.out.println("Question 9 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'I can think of three fun outdoor activities within a 20-minute drive.')]/following::div[3]/div[1]")).click();
        //question 10
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'I will be able to direct my campers to a place on my property to fill up their water containers and dispose of a trash bag.')]/following::div[3]/div[1]")));
        if(driver.getPageSource().contains("I will be able to direct my campers to a place on my property to fill up their water containers and dispose of a trash bag."))
        {
            System.out.println("10th question pass");
        }
        else
        {
            System.out.println("Question 10 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'I will be able to direct my campers to a place on my property to fill up their water containers and dispose of a trash bag.')]/following::div[3]/div[1]")).click();
        //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), 'Create Account')]")));
        driver.findElement(By.xpath(".//div[contains(text(), 'Create Account')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='full_name']")));
        driver.findElement(By.xpath(".//*[@id='full_name']")).clear();
        driver.findElement(By.xpath(".//*[@id='full_name']")).sendKeys("QA Tentrr75");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Tentrr4qa");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("town")));

        driver.findElement(By.id("town")).clear();
        driver.findElement(By.id("town")).sendKeys("Hudson");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("225 Warren St");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zip")));
        driver.findElement(By.id("zip")).clear();
        driver.findElement(By.id("zip")).sendKeys("12534");
        //new Select(driver.findElement(By.id("state"))).selectByVisibleText("NY");
        //driver.findElement(By.linkText("Privacy Policy")).click();
        //driver.findElement(By.linkText("Terms of Service")).click();
        //driver.findElement(By.id("town")).clear();
        //driver.findElement(By.id("town")).sendKeys("New York");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), '28')]")));
        String message1 = element.getText();

        //print the pop-up message
        System.out.println(message1);
        driver.findElement(By.xpath(".//div[contains(text(), '28')]")).click();

        driver.get(baseUrl + "/hosting/become-a-campkeeper/");
    }
}
