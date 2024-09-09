package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class options {
	
	private AppiumDriver driver;
	
	public options(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement optionslistbutton() {
		return driver.findElement(PageElements.optionslistbutton);
	}
	
	public void obdx_options() throws InterruptedException {
		impwait(30);
		optionslistbutton().click();
		impwait(10);
		
		myprofile Myprofile = new myprofile(driver);
		Myprofile.Profile();
//		
		myaccounts MyAccounts = new myaccounts(driver);
		MyAccounts.Myaccs();
		
		settings Settings = new settings(driver);
		Settings.appsettings();
		
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
}
