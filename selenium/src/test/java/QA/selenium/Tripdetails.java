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
public class Tripdetails extends Locomotive {

    @Test
    public void testTripdetails() throws Exception {

        //String winHandleBefore = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();

        driver.findElement(By.xpath(".//button[contains(@class, 'close')]/following::div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.switchTo().window(winHandleBefore);
        //driver.close();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(".//*[@id='default-homepage-hero']/div/a")));
                driver.findElement(By.xpath(".//*[@id='default-homepage-hero']/div/a")).click();
                //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("EXPLORE SITES")));
                //driver.findElement(By.linkText("EXPLORE SITES")).click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='search-page']/div/div/div/div[2]/div[1]/div[1]/div[2]")));
                //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register-link\"]")));

                driver.findElement(By.xpath(".//*[@id='search-page']/div/div/div/div[2]/div[1]/div[1]/div[2]")).click();

                for (String winHandle : driver.getWindowHandles()) {
                    driver.switchTo().window(winHandle);
                }
        Thread.sleep(1000);
        WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".title")));
        String message11 = element11.getText();
        System.out.println(message11);
            driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
            driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
            driver.findElement(By.cssSelector("button.control-arrow.control-next")).click();
            Thread.sleep(1000);
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(), 'View Map')]")));
                driver.findElement(By.xpath(".//a[contains(text(), 'View Map')]")).click();
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='site-detail-tip-access']")));
                driver.findElement(By.xpath(".//*[@id='site-detail-tip-access']")).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.details-section-item.accessibility-box")));
                driver.findElement(By.cssSelector("div.details-section-item.accessibility-box")).click();
                driver.findElement(By.cssSelector("i.tentrr-tip")).click();
                //driver.findElement(By.cssSelector("div.label > i.tentrr-tip")).click();
                //driver.findElement(By.cssSelector("#site-detail-tip-access > i.tentrr-tip")).click();
                driver.findElement(By.cssSelector("section.detail-section.section-activities")).click();
                //driver.findElement(By.cssSelector("#site-detail-tip-closeness > i.tentrr-tip")).click();
                driver.findElement(By.cssSelector("section.detail-section.section-details")).click();
                driver.findElement(By.cssSelector("input.input-search-start")).click();
                driver.findElement(By.xpath(".//div[contains(text(), '27')]")).click();
                 driver.findElement(By.xpath(".//div[contains(text(), '28')]")).click();;
                Select dropdown= new Select(driver.findElement(By.cssSelector("select.search-page-campers")));
                dropdown.selectByValue("6");
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("request-booking-submit")));
                String message = element.getText();
                System.out.println(message);
                driver.findElement(By.id("request-booking-submit")).click();
                driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qa165.tentrr@mailinator.com");
                driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tentrr4qa");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.cssSelector("button.btn.btn-default")).click();
                //driver.findElement(By.xpath(".//*[@id='id_site_billable_articles_0']")).click();
               // driver.findElement(By.xpath(".//*[@id='submit-booking-request']")).click();
                driver.findElement(By.cssSelector("span.coupon-code-text")).click();
        WebElement element10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Apply')]")));
        String message10 = element10.getText();
        System.out.println(message10);
                driver.findElement(By.id("id_promo_code")).clear();
                driver.findElement(By.id("id_promo_code")).sendKeys("apple15");
                driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".code-message.code-invalid")));
        String message2 = element2.getText();


        System.out.println(message2);
                // driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        //driver.findElement(By.cssSelector("span.coupon-code-text")).click();

        driver.findElement(By.id("id_promo_code")).clear();
        driver.findElement(By.id("id_promo_code")).sendKeys("REUSE15");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".code-message.code-success")));
        String message3 = element3.getText();


        System.out.println(message3);
             WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".link.link-open-gift-card-form")));
                String message1 = element1.getText();
                System.out.println(message1);
                driver.findElement(By.cssSelector(".link.link-open-gift-card-form")).click();
                driver.findElement(By.id("submit-booking-request")).click();
               // driver.findElement(By.linkText("Terms of Service.")).click();
                driver.findElement(By.id("gift_card")).clear();
                driver.findElement(By.id("gift_card")).sendKeys("4242424242424242");
       /* WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//p[contains(text(), 'By clicking')]")));
        String message4 = element4.getText();
        System.out.println(message4);*/
                driver.findElement(By.id("submit-booking-request")).click();
                WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), 'Gift Card is not valid.')]")));
                String message5 = element5.getText();
                System.out.println(message5);

                driver.findElement(By.id("id_card_holder_name")).clear();
                driver.findElement(By.id("id_card_holder_name")).sendKeys("Mon Pa");
                driver.findElement(By.id("submit-booking-request")).click();
        WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Please complete all fields')]")));
        String message6 = element6.getText();
        System.out.println(message6);
                driver.findElement(By.id("id_expiration_month")).clear();
                driver.findElement(By.id("id_expiration_month")).sendKeys("05");
                driver.findElement(By.id("id_expiration_year")).clear();
                driver.findElement(By.id("id_expiration_year")).sendKeys("1980");
                driver.findElement(By.id("submit-booking-request")).click();
        WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Please complete all fields')]")));
        String message7 = element7.getText();
        System.out.println(message7);
                driver.findElement(By.id("id_expiration_year")).clear();
                driver.findElement(By.id("id_expiration_year")).sendKeys("2011");
                driver.findElement(By.id("id_credit_card_cvc")).clear();
                driver.findElement(By.id("id_credit_card_cvc")).sendKeys("089");
                driver.findElement(By.id("submit-booking-request")).click();
        WebElement element8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Please complete all fields')]")));
        String message8 = element8.getText();
        System.out.println(message8);
                driver.findElement(By.id("id_postal_code")).clear();
                driver.findElement(By.id("id_postal_code")).sendKeys("11001");
                driver.findElement(By.id("id_camper_message")).clear();
                driver.findElement(By.id("id_camper_message")).sendKeys("hey there!");
                driver.findElement(By.id("submit-booking-request")).click();

            }
        }
