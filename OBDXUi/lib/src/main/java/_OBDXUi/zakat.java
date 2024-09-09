package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class zakat {

	private AppiumDriver driver;
	
	public zakat(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement zakatnsadqat() {
		return driver.findElement(PageElements.zakatnsadqat);
	}
	
	public WebElement zakatbene() {
		return driver.findElement(PageElements.zakatbene);
	}
	
	public WebElement zakatamount() {
		return driver.findElement(PageElements.zakatamount);
	}
	
	public WebElement payzakat() {
		return driver.findElement(PageElements.payzakat);
	}
	
	public WebElement makeanotherdonation() {
		return driver.findElement(PageElements.makeanotherdonation);
	}
	
	public WebElement sadqatbutton() {
		return driver.findElement(PageElements.sadqatbutton);
	}
	
	public WebElement sadqatbene() {
		return driver.findElement(PageElements.sadqatbene);
	}
	
	public WebElement accselectiontoggle() {
		return driver.findElement(PageElements.accselectiontoggle);
	}
	
	public WebElement accselection() {
		return driver.findElement(PageElements.accselection);
	}
	
	public WebElement paysadqa() {
		return driver.findElement(PageElements.paysadqa);
	}
	
	public WebElement next_button() {
		return driver.findElement(PageElements.next_button);
	}
	
	public WebElement save() {
		return driver.findElement(PageElements.save);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	public void Zakat() throws InterruptedException {
		impwait(20);
		zakatnsadqat().click();
		impwait(20);
		Thread.sleep(1000);
		zakatbene().click();
		Thread.sleep(2000);
		impwait(20);
		Thread.sleep(1000);
		zakatamount().click();
		zakatamount().clear();
		zakatamount().sendKeys("100");
		next_button().click();
		impwait(20);
		Thread.sleep(1000);
		payzakat().click();
		impwait(20);
		save().click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		Thread.sleep(2000);
		makeanotherdonation().click();
		impwait(10);
		
		
		//SADQAT
		Thread.sleep(1000);
		sadqatbutton().click();
		impwait(10);
		Thread.sleep(1000);
		sadqatbene().click();
		impwait(10);
		Thread.sleep(1000);
		accselectiontoggle().click();
		impwait(10);
//		performScroll(driver,533,2137,600);
//		impwait(10);
		Thread.sleep(1000);
		accselection().click();
		impwait(10);
		Thread.sleep(1000);
		zakatamount().click();
		zakatamount().clear();
		zakatamount().sendKeys("100");
		next_button().click();
		impwait(20);
		Thread.sleep(1000);
		paysadqa().click();
		impwait(20);
		save().click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		Thread.sleep(2000);
		Thread.sleep(1000);
		homebutton().click();
		impwait(20);
		
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
	
	public static void performtap(AppiumDriver driver, int x, int y) {
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		touchAction.press(PointOption.point(x,y)).release().perform();
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

