//test case is to verify "watch out video link works on homegae
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
public class Video extends Locomotive {
    @Test
    public void testVideo() throws Exception {
        //driver.getPageSource().contains("Watch our video");
        driver.findElement(By.id("link-watch-video")).click();
        System.out.println("It worked");

        //driver.findElement(By.xpath(".//*[@id='player']/div[5]/div[2]/button")).click();
        //driver.findElement(By.xpath(".//*[@id='video-stop-overlay']/div/a")).click();

    }
}
