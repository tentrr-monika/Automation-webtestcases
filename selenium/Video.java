//test case is to verify "watch out video link works on homegae
package QA.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

@Config(
        browser = Browser.CHROME,
        url     = "https://qa1.tentrr.com/"
)
public class Video extends Locomotive {
    @Test
    public void testVideo() throws Exception {
        //driver.getPageSource().contains("Watch our video");
        driver.findElement(By.id("link-watch-video")).click();
        System.out.println("It worked");


    }
}
