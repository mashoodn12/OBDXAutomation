package _OBDXUi;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class viewStatement {
	
	private AppiumDriver driver;

	public viewStatement(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public WebElement viewstatement() {
		return driver.findElement(PageElements.viewstatement);
	}
	public WebElement paymentrec() {
		return driver.findElement(PageElements.payment_record);
	}
	
	public void statement() throws InterruptedException {
		
		viewstatement().click();
		waitForElementToBeVisible(paymentrec());
		Thread.sleep(3000);
		performScrolldown(driver, 530, 2100, 1600);
		Thread.sleep(3000);
		performScrollUp(driver,573,259,1900);
		Thread.sleep(2000);
		driver.navigate().back();
		impwait(10);
		
	}
	
	private void impwait(int duration) {
        driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
    }
	
	public static void performScrolldown(AppiumDriver driver, int x, int y, int move) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(x, y))
                .moveTo(PointOption.point(x, y - move)) // Adjust the distance to scroll as needed
                .release()
                .perform();
    }
	
	public static void performScrollUp(AppiumDriver driver, int x, int y, int move) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(x, y))
                .moveTo(PointOption.point(x, y + move)) // Adjust the distance to scroll as needed
                .release()
                .perform();
    }
	
	public void waitForElementToBeVisible(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }
	
}

