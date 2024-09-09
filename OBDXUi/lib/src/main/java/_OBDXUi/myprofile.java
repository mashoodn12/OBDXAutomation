package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class myprofile {
	
	private AppiumDriver driver;
	
	public myprofile(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement myprofilebutton() {
		return driver.findElement(PageElements.myprofilebutton);
	}
	
	public WebElement profilewaitfinder() {
		return driver.findElement(PageElements.profilewaitfinder);
	}
	
	public WebElement backarrow() {
		return driver.findElement(PageElements.backarrow);
	}
	
	public WebElement optionslistbutton() {
		return driver.findElement(PageElements.optionslistbutton);
	}
	
	public void Profile() throws InterruptedException {
		impwait(10);
		myprofilebutton().click();
		impwait(10);
		profilewaitfinder().click();
		Thread.sleep(5000);
		backarrow().click();
		impwait(10);
		optionslistbutton().click();	
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

}

