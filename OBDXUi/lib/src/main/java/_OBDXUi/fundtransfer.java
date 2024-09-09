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
import io.appium.java_client.touch.offset.PointOption;


public class fundtransfer {
	
	private AppiumDriver driver;
	
	public fundtransfer(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public WebElement sendmoney() {
		return driver.findElement(PageElements.sendmoney);
	}
	
	public WebElement bene() {
		return driver.findElement(PageElements.bene);
	}
	
	public WebElement amount() {
		return driver.findElement(PageElements.amount);
	}
	
	public WebElement comments() {
		return driver.findElement(PageElements.comments);
	}
	
	public WebElement next_button() {
		return driver.findElement(PageElements.next_button);
	}
	
	public WebElement sendnow() {
		return driver.findElement(PageElements.sendnow);
	}
	
	public WebElement makeanothertransfer() {
		return driver.findElement(PageElements.makeanothertransfer);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	public WebElement purpose() {
		return driver.findElement(PageElements.purpose);
	}
	
	public WebElement save() {
		return driver.findElement(PageElements.save);
	}
	
	public WebElement vendorpurpose() {
		return driver.findElement(PageElements.vendorpurpose);
	}
	

	public void FundTransfer() throws InterruptedException {
		
		sendmoney().click();
		impwait(20);
		bene().click();
		impwait(20);
		amount().click();
		amount().sendKeys("23");
		impwait(10);
		performScroll(driver, 525, 1166, 600);
		impwait(10);
		purpose().click();
		impwait(10);
		Thread.sleep(2000);
		vendorpurpose().click();
//		clickOnElementCenter(driver,"//android.view.View[@text=\"Purpose of Transfer Others Educational Donation Zakat Vendor Credit Card Rental Hotel\"]");
		impwait(10);
		comments().click();
		comments().sendKeys("Test");
		next_button().click();
		impwait(20);
		sendnow().click();
		waitForElementToBeVisible(save());
		Thread.sleep(2000);
		save().click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		Thread.sleep(2000);
		impwait(10);
//		makeanothertransfer().click();
//		newbenepay NewBenePay = new newbenepay(driver);
//		NewBenePay.newbenePay();
		homebutton().click();
		
	}
	
	
	private void impwait(int duration) {
        driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
    }
	
	public static void performScroll(AppiumDriver driver, int x, int y, int move) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(x, y))
                .moveTo(PointOption.point(x, y - move)) // Adjust the distance to scroll as needed
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
        
//         Calculate the center of the element
        int centerX = x + (width / 2);
        int centerY = y + (height / 2);
        
        // Perform a tap action using the coordinates
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(centerX, centerY)).perform();
    }
	
	public static void clickOnElementCenter(AppiumDriver driver, String xpath) {
        // Locate the element using the provided XPath
        WebElement element = driver.findElement(By.xpath(xpath));

        // Get the location (x, y) and size (width, height) of the element
        int startX = element.getLocation().getX();
        int startY = element.getLocation().getY();
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        // Calculate the center point
        int centerX = startX + (width / 2);
        int centerY = startY + (height / 2);

        // Perform the click on the center point
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(centerX, centerY)).perform();
    }
	
	public void waitForElementToBeVisible(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

}