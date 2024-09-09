package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class payorder {

	private AppiumDriver driver;
	
	public payorder(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement payorderbutton() {
		return driver.findElement(PageElements.payorderbutton);
	}
	
	public WebElement benename() {
		return driver.findElement(PageElements.benename);
	}
	
	public WebElement cnic() {
		return driver.findElement(PageElements.cnic);
	}
	
	public WebElement mobilenumber() {
		return driver.findElement(PageElements.mobilenumber);
	}
	
	public WebElement payorderamount() {
		return driver.findElement(PageElements.payorderamount);
	}
	
	public WebElement requestpayorder() {
		return driver.findElement(PageElements.requestpayorder);
	}
	
	public WebElement nextbutton() {
		return driver.findElement(PageElements.next_button);
	}
	
	public WebElement save() {
		return driver.findElement(PageElements.save);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	public void payOrder() throws InterruptedException {
		impwait(20);
		payorderbutton().click();
		impwait(20);
		benename().click();
		benename().clear();
		benename().sendKeys("Mashood");
		Thread.sleep(2000);
		cnic().click();
//		cnic.clear();
		cnic().sendKeys("3520285363077");
		Thread.sleep(1000);
		mobilenumber().click();
		mobilenumber().clear();
		mobilenumber().sendKeys("03367871211");
		Thread.sleep(1000);
		nextbutton().click();
		impwait(20);
		Thread.sleep(1000);
		payorderamount().click();
		payorderamount().clear();
		payorderamount().sendKeys("20");
		Thread.sleep(1000);
		nextbutton().click();
		Thread.sleep(2000);
		impwait(30);
		nextbutton().click();
		impwait(30);
		requestpayorder().click();
		Thread.sleep(5000);
		save().click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		Thread.sleep(2000);
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
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // 10 seconds timeout
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" + texttomatch + "\"))"));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + texttomatch + "\")")));
        
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

	
}

