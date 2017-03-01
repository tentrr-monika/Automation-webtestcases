

package QA.selenium;


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

@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)

public class HomePageTest extends Locomotive {

    @Test
    public void testDownloadLinkExists() {
        //wait for the gift card modal screen to appear
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            // to sleep 10 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        String winHandleBefore = driver.getWindowHandle();

        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        try {
            // to sleep 10 seconds
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.switchTo().window(winHandleBefore);

        driver.findElement(By.cssSelector("span.profile-name")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("seleniumcamper@mailinator.com");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Tentrr4qa");

        // WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Log in')]")));
        //String message1 = element.getText();
        //System.out.println(message1);
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        try {
            // to sleep 10 seconds
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }

        driver.findElement(By.xpath(".//*[@id='default-homepage-hero']/div/a")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='search-page']/div/div/div/div[2]/div[1]/div[1]/div[2]")));
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));

        driver.findElement(By.xpath(".//*[@id='search-page']/div/div/div/div[2]/div[1]/div[1]/div[2]")).click();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        try {
            // to sleep 10 seconds
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        WebElement element18= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//p[contains(text(), 'You are already subscribed.')]")));
        String message18 = element18.getText();
        System.out.println(message18);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(), 'View Map')]")));
        //driver.findElement(By.xpath(".//a[contains(text(), 'View Map')]")).click();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='site-detail-tip-access']")));
        driver.findElement(By.xpath(".//*[@id='site-detail-tip-access']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.details-section-item.accessibility-box")));
        driver.findElement(By.cssSelector("div.details-section-item.accessibility-box")).click();

        driver.findElement(By.cssSelector("i.tentrr-tip")).click();

        driver.findElement(By.cssSelector("section.detail-section.section-activities")).click();
        //driver.findElement(By.cssSelector("#site-detail-tip-closeness > i.tentrr-tip")).click();
        driver.findElement(By.cssSelector("section.detail-section.section-details")).click();
        //driver.findElement(By.cssSelector("input.input-search-start")).click();
        /*driver.findElement(By.xpath(".//div[contains(text(), '27')]")).click();
        driver.findElement(By.xpath(".//div[contains(text(), '28')]")).click();*/

        Select dropdown = new Select(driver.findElement(By.cssSelector("select.search-page-campers")));
        dropdown.selectByValue("6");
        WebElement element17 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"price-total-trip\"]")));
        String message17 = element17.getText();
        System.out.println(message17);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("request-booking-submit")));
        String message = element.getText();
        System.out.println(message);

        driver.findElement(By.id("request-booking-submit")).click();
        driver.findElement(By.cssSelector("span.coupon-code-text")).click();
        WebElement element13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Apply')]")));
        String message13 = element13.getText();
        System.out.println(message13);
        driver.findElement(By.id("id_promo_code")).clear();
        driver.findElement(By.id("id_promo_code")).sendKeys("apple15");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        WebElement element14 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".code-message.code-invalid")));
        String message14 = element14.getText();
        System.out.println(message14);

        driver.findElement(By.id("id_promo_code")).clear();
        driver.findElement(By.id("id_promo_code")).sendKeys("REUSE15");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        WebElement element15 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".code-message.code-success")));
        String message15 = element15.getText();
        System.out.println(message15);
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        WebElement element16= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='total-cost-value']")));
        String message16 = element16.getText();
        System.out.println(message16);

        driver.findElement(By.id("submit-booking-request")).click();
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
        driver.findElement(By.linkText("Your Trips")).click();
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".confirm-id-id")));
        String message5 = element5.getText();
        System.out.println(message5);
        driver.findElement(By.linkText("REQUESTED")).click();
        WebElement element6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".confirm-id-id")));
        String message6 = element6.getText();
        System.out.println(message6);
        driver.findElement(By.linkText("UPCOMING")).click();
        WebElement element7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".no-results")));
        String message7 = element7.getText();
        System.out.println(message7);
        driver.findElement(By.linkText("COMPLETED")).click();
        WebElement element8 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".no-results")));
        String message8 = element8.getText();
        System.out.println(message8);
        driver.findElement(By.linkText("CANCELLED")).click();
        WebElement element9 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".confirm-id-id")));
        String message9 = element9.getText();
        System.out.println(message9);
        driver.findElement(By.linkText("REQUESTED")).click();
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.findElement(By.cssSelector(".btn.btn-trans.btn-decline")).click();
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Cancel trip')]")).click();
        WebElement element10 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".no-results")));
        String message10 = element10.getText();
        System.out.println(message10);
        try {
            // to sleep 10 seconds
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            java.lang.Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        driver.findElement(By.linkText("CANCELLED")).click();
        WebElement element11 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".confirm-id-id")));
        String message11 = element11.getText();
        System.out.println(message11);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Messages"));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Messages')]")));
        String message1 = element1.getText();
        System.out.println(message1);
        driver.findElement(By.linkText("Profile")).click();
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class=\"description\"]")));
        String message2 = element2.getText();
        System.out.println(message2);
        /*driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[6]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[5]/a")));
        driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[5]/a")).click();*/
        driver.findElement(By.id("address_one")).clear();
        driver.findElement(By.id("address_one")).sendKeys("134 bowery st");
        driver.findElement(By.id("municipality")).clear();
        driver.findElement(By.id("municipality")).sendKeys("New York");
        driver.findElement(By.id("postal_code")).clear();
        driver.findElement(By.id("postal_code")).sendKeys("10001");
        Select dropdown1 = new Select(driver.findElement(By.id("state")));
        dropdown1.selectByValue("NY");
        driver.findElement(By.id("phone_daytime")).clear();
        driver.findElement(By.id("phone_daytime")).sendKeys("91753674959");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        driver.findElement(By.linkText("Edit Public Profile")).click();
        driver.findElement(By.id("description")).clear();
        driver.findElement(By.id("description")).sendKeys("I work for tentrr!");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        driver.findElement(By.linkText("Account")).click();
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Account')]")));
        String message3 = element3.getText();
        System.out.println(message3);
        driver.findElement(By.linkText("Payout account")).click();
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class=\"description\"]")));
        String message4 = element4.getText();
        System.out.println(message4);
        driver.findElement(By.linkText("Payment method")).click();
        WebElement element12 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class=\"description\"]")));
        String message12 = element12.getText();
        System.out.println(message12);
        /*driver.findElement(By.linkText("Messages")).click();
        driver.findElement(By.linkText("Your Trips")).click();
        driver.findElement(By.linkText("REQUESTED")).click();
        driver.findElement(By.linkText("UPCOMING")).click();
        driver.findElement(By.linkText("COMPLETED")).click();
        driver.findElement(By.linkText("CANCELLED")).click();
        driver.findElement(By.cssSelector("span.messages-text")).click();
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.linkText("Payout account")).click();
        driver.findElement(By.linkText("Payment method")).click();*/
        driver.close();

    }

}
