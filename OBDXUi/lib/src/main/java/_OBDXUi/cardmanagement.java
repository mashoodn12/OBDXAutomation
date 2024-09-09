package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;


public class cardmanagement {
	
	private AppiumDriver driver;
	
	public cardmanagement(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement cardmanagement() {
		return driver.findElement(PageElements.cardmanagement);
	}
	
	public WebElement cardpermission() {
		return driver.findElement(PageElements.cardpermission);
	}
	
	public WebElement permissiontoggle1() {
		return driver.findElement(PageElements.permissiontoggle1);
	}
	
	public WebElement permissiontoggle2() {
		return driver.findElement(PageElements.permissiontoggle2);
	}
	
	public WebElement cardblocktoggle() {
		return driver.findElement(PageElements.cardblocktoggle);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	public void Cardmanagement() throws InterruptedException {
		impwait(20);
		cardmanagement().click();
		impwait(20);
		cardpermission().click();
		impwait(20);
		permissiontoggle1().click();
		impwait(20);
		permissiontoggle2().click();
		Thread.sleep(4000);
		driver.navigate().back();
		impwait(20);
		cardblocktoggle().click();
		Thread.sleep(3000);
		homebutton().click();

	}

	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

}

