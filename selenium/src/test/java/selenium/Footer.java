//This test case to verify the footer links works as expected

package selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

@Config(
        browser = Browser.CHROME,
        url     = "https://stage.tentrr.com/"
)

public class Footer extends Locomotive {
    @Test
    public void testFooter() throws Exception {
        driver.findElement(By.linkText("FAQ")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=none | ]]
        //driver.findElement(By.xpath("//li[3]/span")).click();
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        driver.findElement(By.linkText("TERMS OF SERVICE")).click();
        if(driver.getPageSource().contains("TERMS OF SERVICE"))
        {
            System.out.println("Terms of service Pass");
        }
        else
        {
            System.out.println("Terms of service Fail");
        }

        driver.findElement(By.linkText("PRIVACY POLICY")).click();
        if(driver.getPageSource().contains("Privacy Policy"))
        {
            System.out.println("Privacy policy Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        driver.findElement(By.linkText("CAREERS")).click();

        if(driver.getPageSource().contains("Come work with us!"))
        {
            System.out.println("Careers Pass");
        }
        else
        {
            System.out.println("Career page Fail");
        }

        /*driver.findElement(By.linkText("BLOG")).click();
        if(driver.getPageSource().contains("The Tentrr New Year's Bucket List"))
        {
            System.out.println("Blog Pass");
        }
        else
        {
            System.out.println("Blog Fail");
        }*/

        driver.findElement(By.linkText("EFFORTLESS CAMPING")).click();
        if(driver.getPageSource().contains("Camping Made Dirt Simple"))
        {
            System.out.println("Effortless camping Pass");
        }
        else
        {
            System.out.println("Effortless camping Fail");
        }

        driver.findElement(By.linkText("CAMPER Q&A")).click();
        if(driver.getPageSource().contains("Getting Started"))
        {
            System.out.println("Getting Started Pass");
        }
        else
        {
            System.out.println("Getting Started Fail");
        }

        driver.findElement(By.linkText("Pre-Trip")).click();
        if(driver.getPageSource().contains("Pre-Trip"))
        {
            System.out.println("Pre-Trip Pass");
        }
        else
        {
            System.out.println("Pre-Trip page Fail");
        }

        driver.findElement(By.linkText("Camping Experience")).click();
        if(driver.getPageSource().contains("Camping Experience"))
        {
            System.out.println("Camping Experience Pass");
        }
        else
        {
            System.out.println("Camping Experience Fail");
        }

        driver.findElement(By.linkText("Post-Trip")).click();
        if(driver.getPageSource().contains("Post-Trip"))
        {
            System.out.println("Post-Trip Pass");
        }
        else
        {
            System.out.println("Post-Trip Fail");
        }

        driver.findElement(By.linkText("Trust & Safety")).click();
        if(driver.getPageSource().contains("Trust & Safety"))
        {
            System.out.println("Trust & Safety Pass");
        }
        else
        {
            System.out.println("Trust & Safety Fail");
        }

        driver.findElement(By.linkText("Looking for CampKeeper Q&A?")).click();
        if(driver.getPageSource().contains("Getting Started"))
        {
            System.out.println("CampKeeper Pass");
        }
        else
        {
            System.out.println("CampKeeper Q&A Fail");
        }

        driver.findElement(By.linkText("Payout")).click();
        if(driver.getPageSource().contains("Payout"))
        {
            System.out.println("Payout Pass");
        }
        else
        {
            System.out.println("Payout Fail");
        }

        driver.findElement(By.linkText("Profile & Booking")).click();
        if(driver.getPageSource().contains("Profile & Booking"))
        {
            System.out.println("Profile Pass");
        }
        else
        {
            System.out.println("Profile Fail");
        }
        driver.findElement(By.linkText("Campers: Before, during and after")).click();
        if(driver.getPageSource().contains("Campers: Before, during and after"))
        {
            System.out.println("Campers: Before, during and after Pass");
        }
        else
        {
            System.out.println("Campers: Before, during and after Fail");
        }
        driver.findElement(By.linkText("Trust & Safety")).click();
        if(driver.getPageSource().contains("Trust & Safety"))
        {
            System.out.println("Trust & Safety Pass");
        }
        else
        {
            System.out.println("Trust & Safety Fail");
        }


        driver.findElement(By.linkText("GIFT CARDS")).click();
        if(driver.getPageSource().contains("A Card for All Seasons"))
        {
            System.out.println("Gift cards Pass");
        }
        else
        {
            System.out.println("Gift cards Fail");
        }
        driver.findElement(By.linkText("CAMP HOSPITALITY")).click();
        if(driver.getPageSource().contains("An In-Tents Opportunity"))
        {
            System.out.println("Camp Hospitality Pass");
        }
        else
        {
            System.out.println("Camp Hospitality Fail");
        }
        driver.findElement(By.linkText("CAMPKEEPER Q&A")).click();
        driver.findElement(By.linkText("PRESS CONTACT")).click();
    }

}
