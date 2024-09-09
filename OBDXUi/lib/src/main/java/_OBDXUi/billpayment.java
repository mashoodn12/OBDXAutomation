package _OBDXUi;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class billpayment {
	
	private AppiumDriver driver;
	
	public billpayment(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement billbutton() {
		return driver.findElement(PageElements.billbutton);
	}
	
	public WebElement newpayment() {
		return driver.findElement(PageElements.newpayment);
	}
	
	public WebElement ssgc() {
		return driver.findElement(PageElements.ssgc);
	}
	
	public WebElement customerno() {
		return driver.findElement(PageElements.customerno);
	}
	
	public WebElement fetchbill() {
		return driver.findElement(PageElements.fetchbill);
	}
	
	public WebElement paynow() {
		return driver.findElement(PageElements.paynow);
	}
	
	public WebElement save() {
		return driver.findElement(PageElements.save);
	}
	
	public WebElement search() {
		return driver.findElement(PageElements.search);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	public void Billpayment() throws InterruptedException {
		impwait(10);
		billbutton().click();
		impwait(20);
		newpayment().click();
//		performScroll(driver,1015,513,910);
//		performScroll(driver,1015,513,910);
//		WebElement corporate = driver.findElement(By.xpath("//android.view.View[@text=\"Corporate\"]"));
//		corporate.click();
		impwait(10);		
		search().click();
		search().clear();
		search().sendKeys("SSGC");
		impwait(10);
		ssgc().click();
		impwait(20);
		customerno().click();
		customerno().clear();
		customerno().sendKeys("0447461601");
		impwait(20);
		fetchbill().click();
		impwait(20);
		paynow().click();
		save().click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		impwait(20);
//		WebElement addbiller = driver.findElement(By.xpath("//android.widget.Button[@text=\"Add to Biller List\"]"));
//		addbiller.click();
//		Thread.sleep(2000);
//		testTapByCoordinates("Yes");
//		Thread.sleep(2000);
//		WebElement makenew = driver.findElement(By.xpath("//android.widget.Button[@text=\"Make New Payment\"]"));
//		makenew.click();
//		impwait(20);
//		WebElement favbill = driver.findElement(By.xpath("(//android.widget.Image[@text=\"colored-star\"])[2]"));
//		favbill.click();
		Thread.sleep(3000);
		homebutton().click();
		
		
		
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	public static void performScroll(AppiumDriver driver, int x, int y, int move) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(x, y))
                .moveTo(PointOption.point(x- move, y)) // Adjust the distance to scroll as needed
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
	
}

