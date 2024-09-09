package _OBDXUi;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;


public class accountCard {
	private AppiumDriver driver;
	
	public accountCard(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public WebElement star() {
		return driver.findElement(PageElements.star);
	}
	
	public void accCard() throws InterruptedException {
		performScroll(driver, 979, 450, 800);
		Thread.sleep(2000);
		star().click();
		Thread.sleep(2000);
		TapByCoordinates("Yes");
		Thread.sleep(2000);
		TapByCoordinates("Done");
		
	}
	
	private void impwait(int duration) {
        driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
    }
	
	public static void performScroll(AppiumDriver driver, int x, int y, int move) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(x, y))
                .moveTo(PointOption.point(x-move, y)) // Adjust the distance to scroll as needed
                .release()
                .perform();
    }
	
	public void TapByCoordinates(String texttomatch) {
        // Locate the element by its text
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"" + texttomatch + "\")"));  
        
        // Get the element's coordinates
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
        
        // Calculate the center of the element
        int centerX = x + (width / 2);
        int centerY = y + (height / 2);
        
        // Perform a tap action using the coordinates
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(centerX, centerY)).perform();
    }
	
	public void waitForElementToBeVisible(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }
}

