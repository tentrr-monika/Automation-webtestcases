

//This test cases verify login works as expected.

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
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("1235");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys(" ");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();

        //driver.findElement(By.cssSelector("span.profile-name")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("@gmail.com");
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("1111111");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();

       //driver.findElement(By.cssSelector("span.profile-name")).click();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("monika@tentrr.com");
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
        WebElement element1 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Messages')]")));
        String message2 = element1.getText();
        System.out.println(message2);
        driver.findElement(By.xpath(".//span[contains(text(),'Messages')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[5]/a")));
        String message3 = element2.getText();
        System.out.println(message3);
        driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[5]/a")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[6]/a")));
        String message4 = element3.getText();
        System.out.println(message4);
        driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[6]/a")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[5]/a")));
        driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[1]/div/ul/li[5]/a")).click();
        driver.findElement(By.id("address_one")).clear();
        driver.findElement(By.id("address_one")).sendKeys("134 bowery st");
        driver.findElement(By.id("municipality")).clear();
        driver.findElement(By.id("municipality")).sendKeys("New York");
        driver.findElement(By.id("postal_code")).clear();
        driver.findElement(By.id("postal_code")).sendKeys("10001");
        Select dropdown=new Select(driver.findElement(By.id("state")));
        dropdown.selectByValue("NY");
        driver.findElement(By.id("phone_daytime")).clear();
        driver.findElement(By.id("phone_daytime")).sendKeys("91753674959");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        driver.findElement(By.linkText("Edit Public Profile")).click();
        driver.findElement(By.id("description")).clear();
        driver.findElement(By.id("description")).sendKeys("I work for tentrr!");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.linkText("Payout account")).click();
        driver.findElement(By.linkText("Payment method")).click();
        driver.findElement(By.linkText("Payout account")).click();
        driver.findElement(By.linkText("Messages")).click();
        driver.findElement(By.linkText("Your Trips")).click();
        driver.findElement(By.linkText("REQUESTED")).click();
        driver.findElement(By.linkText("UPCOMING")).click();
        driver.findElement(By.linkText("COMPLETED")).click();
        driver.findElement(By.linkText("CANCELLED")).click();
        driver.findElement(By.cssSelector("span.messages-text")).click();
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.linkText("Payout account")).click();
        driver.findElement(By.linkText("Payment method")).click();
        driver.findElement(By.cssSelector("div.btn.btn-disabled")).click();
        driver.findElement(By.cssSelector("div.close.icon-close-small")).click();
        driver.close();

    }

//    @Test
//    public void testTabsExist() {
//        validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
//                .validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
//                .validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
//                .validatePresent(HomePage.LOC_LNK_SUPPORTTAB)
//                .validatePresent(HomePage.LOC_LNK_ABOUTTAB)
//        ;
//    }

}
