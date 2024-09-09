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


public class raast {
	
	private AppiumDriver driver;
	
	public raast(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement vendorpurpose() {
		return driver.findElement(PageElements.vendorpurpose);
	}
	
	public WebElement raastbutton() {
		return driver.findElement(PageElements.raastbutton);
	}
	
	public WebElement makenewtransfer() {
		return driver.findElement(PageElements.makenewtransfer);
	}
	
	public WebElement raastid() {
		return driver.findElement(PageElements.raastid);
	}
	
	public WebElement addpayee() {
		return driver.findElement(PageElements.addpayee);
	}
	
	public WebElement accounttabbtn() {
		return driver.findElement(PageElements.accounttabbtn);
	}
	
	public WebElement ibanradiobutton() {
		return driver.findElement(PageElements.ibanradiobtn);
	}
	
	public WebElement ibanpre() {
		return driver.findElement(PageElements.ibanpre);
	}
	
	public WebElement ibanbank() {
		return driver.findElement(PageElements.ibanbank);
	}
	
	public WebElement ibannumber() {
		return driver.findElement(PageElements.ibannumber);
	}
	
	public WebElement purpose() {
		return driver.findElement(PageElements.purpose);
	}
	
	public WebElement anotherraasttrans() {
		return driver.findElement(PageElements.anotherraasttrans);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	public WebElement titlefetchbutton() {
		return driver.findElement(PageElements.titlefetchbutton);
	}
	
	public WebElement nextbutton() {
		return driver.findElement(PageElements.next_button);
	}
	
	public WebElement amount() {
		return driver.findElement(PageElements.amount);
	}
	
	public WebElement comments() {
		return driver.findElement(PageElements.comments);
	}
	
	public WebElement sendnow() {
		return driver.findElement(PageElements.sendnow);
	}
	
	public WebElement save() {
		return driver.findElement(PageElements.save);
	}
	
	public void Raast() throws InterruptedException {
		raastbutton().click();
		impwait(20);
		makenewtransfer().click();
		impwait(20);
		
		//raastID
		raastid().click();
		raastid().clear();
		raastid().sendKeys("03022778000");
		fetchandpay(driver);
		Thread.sleep(1000);
		anotherraasttrans().click();
//		
		//ACCOUNT
		//IBAN
//		impwait(20);
//		makenewtransfer().click();
		impwait(20);
		accounttabbtn().click();
//		impwait(20);
//		ibanradiobutton().click();
		ibanpre().click();
		ibanpre().clear();
		ibanpre().sendKeys("47");
		ibanbank().click();
		ibanbank().clear();
		ibanbank().sendKeys("UNIL");
		ibannumber().click();
		ibannumber().clear();
		ibannumber().sendKeys("0109000238266766");
		driver.navigate().back();
		ibanpre().click();
		Thread.sleep(1000);
		fetchandpay(driver);
		anotherraasttrans().click();
		
		homebutton().click();
		
		//account 
		//account number
//		impwait(20);
//		driver.findElement(By.xpath("//android.view.View[@text=\"Raast Payment\"]")).click();
//		impwait(20);
//		driver.findElement(By.xpath("//android.widget.Button[@text=\"Make a New Transfer\"]")).click();
//		impwait(20);
//		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Account\"]")).click();
//		impwait(20);
//		driver.findElement(By.xpath("//android.widget.RadioButton[@text=\"Account Number\"]")).click();
//		impwait(20);
//		testTapByCoordinates("Select Bank");
//		Thread.sleep(2000);		
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
		
	public void fetchandpay(AppiumDriver driver) throws InterruptedException {
		titlefetchbutton().click();
		impwait(20);
		nextbutton().click();
		impwait(20);
		amount().click();
		amount().clear();
		amount().sendKeys("50");
		driver.navigate().back();
		purpose().click();
		impwait(20);
		vendorpurpose().click();
//		clickOnElementCenter(driver, "//android.view.View[@text=\"Purpose of Transfer Others Educational Donation Zakat Vendor Credit Card Rental Hotel\"]");
		impwait(20);
		comments().click();
		comments().clear();
		comments().sendKeys("Test");
		impwait(20);
		nextbutton().click();
		impwait(20);
		sendnow().click();
		waitForElementToBeVisible(save());
		Thread.sleep(2000);
		save().click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		Thread.sleep(2000);
		addpayee().click();
		Thread.sleep(2000);
		TapByCoordinates("Save");
		Thread.sleep(3000);
		TapByCoordinates("Close");
		impwait(10);
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