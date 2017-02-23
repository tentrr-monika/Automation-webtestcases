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
public class Faqs extends Locomotive {
    @Test
    public void testFaq() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("FAQ")));
        String message = element.getText();
        System.out.println(message + "link");
        driver.findElement(By.linkText("FAQ")).click();
       // String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'Top 10 most frequently asked questions')]")));
        String message1 = element1.getText();
        System.out.println(message1);
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div/ul/li[1]/div/span")).click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'What is included in a Tentrr Campsite?')]")));
        String message2 = element2.getText();
        System.out.println(message2);
        //driver.findElement(By.xpath("/html/body/main/div/div[4]/div/ul/li[1]/div/span")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'What is the cancellation policy?')]")));
        String message3 = element3.getText();
        System.out.println(message3);
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'How do referrals and camping credits work?')]")));
        String message4 = element4.getText();
        System.out.println(message4);
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'How do I modify a reservation?')]")));
        String message5 = element5.getText();
        System.out.println(message5);
        WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'Can I edit my profile?')]")));
        String message6 = element6.getText();
        System.out.println(message6);
        driver.findElement(By.cssSelector("a.more-questions-title")).click();
        WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Camper Q&A')]")));
        String message7 = element7.getText();
        System.out.println(message7);
        driver.findElement(By.linkText("CAMPER Q&A")).click();
        WebElement element8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(), 'Camper Q&A')]")));
        String message8 = element8.getText();
        System.out.println(message8);
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.linkText("Pre-Trip")).click();
        WebElement element9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Pre-Trip')]")));
        String message9 = element9.getText();
        System.out.println(message9);
        driver.findElement(By.linkText("Camping Experience")).click();
        WebElement element17 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Camping Experience')]")));
        String message17 = element17.getText();
        System.out.println(message17);
        driver.findElement(By.linkText("Post-Trip")).click();
        WebElement element10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Post-Trip')]")));
        String message10 = element10.getText();
        System.out.println(message10);
        driver.findElement(By.linkText("Trust & Safety")).click();
        WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Trust & Safety")));
        String message11 = element11.getText();
        System.out.println(message11);
        driver.findElement(By.linkText("Looking for CampKeeper Q&A?")).click();
        WebElement element12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[contains(text(), 'CampKeeper Q&A')]")));
        String message12 = element12.getText();
        System.out.println(message12);
        driver.findElement(By.cssSelector(".read-more-link")).click();
        driver.findElement(By.cssSelector(".read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.cssSelector("span.read-more-link")).click();
        driver.findElement(By.linkText("Payout")).click();
        WebElement element13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Payout')]")));
        String message13 = element13.getText();
        System.out.println(message13);
        driver.findElement(By.linkText("Profile & Booking")).click();
        WebElement element14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Profile & Booking')]")));
        String message14 = element14.getText();
        System.out.println(message14);
        driver.findElement(By.linkText("Campers: Before, during and after")).click();
        WebElement element15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Campers: Before, during, and after')]")));
        String message15 = element15.getText();
        System.out.println(message15);
        driver.findElement(By.linkText("Trust & Safety")).click();
        WebElement element16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[contains(text(), 'Trust & Safety')]")));
        String message16 = element16.getText();
        System.out.println(message16);





    }

}
