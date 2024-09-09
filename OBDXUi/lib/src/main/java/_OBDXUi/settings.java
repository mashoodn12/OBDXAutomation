package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class settings {

	private AppiumDriver driver;
	
	public settings(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement optionslistbutton() {
		return driver.findElement(PageElements.optionslistbutton);
	}
	
	public WebElement settingsbutton() {
		return driver.findElement(PageElements.settingsbutton);
	}
	
	public WebElement changeotppref() {
		return driver.findElement(PageElements.changeotppref);
	}
	
	public WebElement smsandemail() {
		return driver.findElement(PageElements.smsandemail);
	}
	
	public WebElement savechanges() {
		return driver.findElement(PageElements.savechanges);
	}
	
	public WebElement manageregistereddevices() {
		return driver.findElement(PageElements.manageregistereddevices);
	}
	
	public WebElement remove() {
		return driver.findElement(PageElements.remove);
	}
	
	public WebElement managebiodevices() {
		return driver.findElement(PageElements.managebiodevices);
	}
	
	public WebElement accmanagementbutton() {
		return driver.findElement(PageElements.accmanagementbutton);
	}
	
	public WebElement accmanageselection() {
		return driver.findElement(PageElements.accmanageselection);
	}
	
	public WebElement limitmanagementbutton() {
		return driver.findElement(PageElements.limitmanagementbutton);
	}
	
	public WebElement meezantomeezanlimit() {
		return driver.findElement(PageElements.meezantomeezanlimit);
	}
	
	public WebElement apply() {
		return driver.findElement(PageElements.apply);
	}
	
	public WebElement meezantootherlimit() {
		return driver.findElement(PageElements.meezantootherlimit);
	}
	
	public WebElement changepassword() {
		return driver.findElement(PageElements.changepassword);
	}
	
	public WebElement currentpassword() {
		return driver.findElement(PageElements.currentpassword);
	}
	
	public WebElement newpassword1() {
		return driver.findElement(PageElements.newpassword1);
	}
	
	public WebElement newpassword2() {
		return driver.findElement(PageElements.newpassword2);
	}
	
	public WebElement updatepassword() {
		return driver.findElement(PageElements.updatepassword);
	}
	
	public WebElement backarrow() {
		return driver.findElement(PageElements.backarrow);
	}
	
	public WebElement next_button() {
		return driver.findElement(PageElements.next_button);
	}
	
	public WebElement show_balance() {
		return driver.findElement(PageElements.show_balance);
	}
	
	public void appsettings() throws InterruptedException {
		impwait(20);
		settingsbutton().click();
		impwait(20);
		
		//change otp prefernces
		changeotppref().click();
		impwait(20);
		smsandemail().click();
		impwait(10);
		savechanges().click();
		testTapByCoordinates("Done");
		Thread.sleep(1000);
		backarrow().click();
		impwait(20);
		
		//manage registerd devices
		manageregistereddevices().click();
		Thread.sleep(3000);
		impwait(20);
		remove().click();
		Thread.sleep(2000);
		impwait(10);
		backarrow().click();
		Thread.sleep(2000);
		impwait(20);
		
		//manage biometric device
		managebiodevices().click();
		Thread.sleep(3000);
		backarrow().click();
		Thread.sleep(2000);
		impwait(20);
		
		//account management
		accmanagementbutton().click();
		Thread.sleep(3000);
		impwait(20);
		accmanageselection().click();
		Thread.sleep(2000);
		impwait(20);
		savechanges().click();
		Thread.sleep(2000);
		impwait(20);
		
		//limit management
		optionslistbutton().click();
		impwait(20);
		settingsbutton().click();
		Thread.sleep(2000);
		impwait(20);
		limitmanagementbutton().click();
		Thread.sleep(2000);
		//meezan to meezan
		meezantomeezanlimit().click();
		Thread.sleep(2000);
		performtap(driver,561,561);
		Thread.sleep(2000);
		apply().click();
		Thread.sleep(2000);
		testTapByCoordinates("Yes, Apply Now!");
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(2000);
		impwait(20);
		//meezan to other banks unchanged
		meezantootherlimit().click();
		Thread.sleep(2000);
		performtap(driver,919,561);
		Thread.sleep(2000);
		apply().click();
		Thread.sleep(3000);
//		WebElement applynow1 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Yes, Apply Now!\"]"));
//		applynow1.click();
//		testTapByCoordinates("Yes, Apply Now!");
//		Thread.sleep(3000);
		testTapByCoordinates("Close");
		Thread.sleep(1000);
		backarrow().click();
		Thread.sleep(2000);
		impwait(20);
		backarrow().click();
		
		//change password
		changepassword().click();
		impwait(20);
		currentpassword().click();
		currentpassword().clear();
		currentpassword().sendKeys("Admin@1234");
		next_button().click();
		newpassword1().click();
		newpassword1().clear();
		newpassword1().sendKeys("Admin@1234");
		newpassword2().click();
		newpassword2().clear();
		newpassword2().sendKeys("Admin@1234");
		impwait(20);
		updatepassword().click();
		Thread.sleep(3000);
		testTapByCoordinates("Done");
		Thread.sleep(5000);
		login Login = new login(driver);
		Login.loginaction("Sarfaraz1999", "Admin@1234");
		impwait(20);
		show_balance();
		Thread.sleep(4000);
		
		
		
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	public static void performtap(AppiumDriver driver, int x, int y) {
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		touchAction.press(PointOption.point(x,y)).release().perform();
	}
	
	
	public void testTapByCoordinates(String texttomatch) {
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
