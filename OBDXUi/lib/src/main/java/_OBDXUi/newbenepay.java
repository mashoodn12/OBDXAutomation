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


public class newbenepay {

	private AppiumDriver driver;
	
	public newbenepay(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement newaccount() {
		return driver.findElement(PageElements.newaccount);
	}
	
	public WebElement search() {
		return driver.findElement(PageElements.search);
	}
	
	public WebElement HBLKonnect() {
		return driver.findElement(PageElements.HBLKonnect);
	}
	
	public WebElement accountnumber() {
		return driver.findElement(PageElements.accountnumber);
	}
	
	public WebElement titlefetchbutton() {
		return driver.findElement(PageElements.titlefetchbutton);
	}
	
	public void newbenePay() throws InterruptedException {
		
		Thread.sleep(2000);
		impwait(20);
		newaccount().click();
		Thread.sleep(2000);
		impwait(10);
		search().click();
		search().clear();
		search().sendKeys("HBL Konnect");
		impwait(10);
		HBLKonnect().click();
		Thread.sleep(2000);
		impwait(10);
		accountnumber().click();
		accountnumber().clear();
		accountnumber().sendKeys("12345678911112");
		titlefetchbutton().click();
		impwait(20);
		WebElement amount = driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Amount - Meezan Bank\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText"));
		amount.click();
		amount.sendKeys("23");
		impwait(10);
		performScroll(driver, 525, 1166, 600);
		impwait(10);
		driver.findElement(By.xpath("(//android.widget.Image[@text=\"arrow-drop-down\"])[2]")).click();
		impwait(10);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Vendor\"]")).click();
		impwait(10);
		WebElement comments = driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Amount - Meezan Bank\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.EditText"));
		comments.click();
		comments.sendKeys("Test");
		WebElement nextbtn = driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]"));
		nextbtn.click();
		impwait(20);
		WebElement sendnow = driver.findElement(By.xpath("//android.widget.Button[@text=\"Send Now\"]"));
		sendnow.click();
		impwait(20);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"save-icon\"]")).click();
		Thread.sleep(2000);
		TapByCoordinates("Close");
		Thread.sleep(2000);
		
		//iban
		
		
//		WebElement addacc = driver.findElement(By.xpath("//android.widget.Button[@text=\"Add new account to list\"]"));
//		addacc.click();
		
	
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
//        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"" + texttomatch + "\")"));  
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // 10 seconds timeout
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" + texttomatch + "\"))"));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + texttomatch + "\")")));
        
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
