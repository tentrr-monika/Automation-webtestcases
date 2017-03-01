package selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by monikapathak on 1/26/17.
 */

@Config(
        browser = Browser.CHROME,
        url     = "https://stage.tentrr.com/"

)
public class Negativecampkeepersquiz extends Locomotive {
    @Test
    public void testNegativecampkeeperquiz() throws Exception {
        driver.get(baseUrl + "/hosting/become-a-campkeeper/");
        WebDriverWait wait = new WebDriverWait(driver, 200);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-default")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn.btn-default.btn-onboarding-submit")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='keeper-get-started']/div/div/div/div/form/div/button")));
        //driver.findElement(By.xpath("//div[@id='keeper-get-started']/div/div/div/div/form/div/button")).click();
        driver.findElement(By.id("onboarding-email")).clear();
        driver.findElement(By.id("onboarding-email")).sendKeys("qana19.tentrr@mailinator.com");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='keeper-get-started']/div/div/div/div/form/div/button")));

        driver.findElement(By.cssSelector(".btn.btn-default.btn-onboarding-submit")).click();
       // driver.findElement(By.xpath("//div[@id='keeper-get-started']/div/div/div/div/form/div/button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onboarding-zip")));
        driver.findElement(By.id("onboarding-zip")).clear();
        driver.findElement(By.id("onboarding-zip")).sendKeys("11001");
        driver.findElement(By.cssSelector(".btn.btn-default.btn-onboarding-submit")).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='keeper-get-started']/div/div/div/div/form/div/button")));
       // driver.findElement(By.xpath("//div[@id='keeper-get-started']/div/div/div/div/form/div/button")).click();
        //question 1
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'I own about 15 acres (or more) of lovely land.')]/following::div[3]/div[2]")));
        Thread.sleep(1000);
        if(driver.getPageSource().contains("I own about 15 acres (or more) of lovely land."))
        {
            System.out.println("First question pass");
        }
        else
        {
            System.out.println("Question 1 Fail");
        }
        driver.findElement(By.xpath("//p[contains(text(),'I own about 15 acres (or more) of lovely land.')]/following::div[3]/div[2]")).click();
        //question 1a
        //p[contains(text(), 'We just need a little more information. How many acres do you own?')]
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".quiz-inputs>select")));
        Thread.sleep(1000);
        if(driver.getPageSource().contains("We just need a little more information. How many acres do you own?"))
        {
            System.out.println("1a question pass");
        }
        else
        {
            System.out.println("Question 1a Fail");
        }
        Thread.sleep(1000);
        WebElement mySelectElm = driver.findElement(By.cssSelector(".quiz-inputs>select"));
        Select mySelect= new Select(mySelectElm);
        mySelect.selectByValue("13");

       //Select dropdown = new Select(driver.findElement(By.cssSelector(".quiz-inputs>select")));
        //dropdown.selectByValue("13");
        driver.findElement(By.xpath(".//div[contains(text(), 'Next')]")).click();

        //question 2
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'The spot I have in mind for my campsite is private and secluded.')]/following::div[3]/div[2]")));
        if(driver.getPageSource().contains("The spot I have in mind for my campsite is private and secluded."))
        {
            System.out.println("Second question pass");
        }
        else
        {
            System.out.println("Question 2 Fail");
        }
        driver.findElement(By.xpath("//p[contains(text(),'The spot I have in mind for my campsite is private and secluded.')]/following::div[3]/div[2]")).click();

        //question 3

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(),'The spot I have in mind for my campsite is quiet.')]/following::div[3]/div[2]")));//*[@id="keeper-get-started"]/div/div/div/div/div[2]/div[3]/div[1]
        if(driver.getPageSource().contains("The spot I have in mind for my campsite is quiet."))
        {
            System.out.println("Third question pass");
        }
        else
        {
            System.out.println("Question 3 Fail");
        }
        driver.findElement(By.xpath(".//p[contains(text(),'The spot I have in mind for my campsite is quiet.')]/following::div[3]/div[2]")).click();
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(), 'I will be able to direct my campers to a place on my property to fill up their water containers and dispose of a trash bag.')]/following::div[3]/div[2]")));
        if(driver.getPageSource().contains("I will be able to direct my campers to a place on my property to fill up their water containers and dispose of a trash bag."))
        {
            System.out.println("10th question pass");
        }
        else
        {
            System.out.println("Question 10 Fails");
        }
        driver.findElement(By.xpath(".//p[contains(text(), 'I will be able to direct my campers to a place on my property to fill up their water containers and dispose of a trash bag.')]/following::div[3]/div[2]")).click();
        //*[@id="keeper-get-started"]/div/div/div/div/div[2]/div
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='description']")));
        String message1 = element.getText();

        //print the pop-up message
        System.out.println(message1);
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("My land is awesome");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[contains(text(), 'Submit')]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//button[contains(text(), 'Submit')]")).click();


    }
}


