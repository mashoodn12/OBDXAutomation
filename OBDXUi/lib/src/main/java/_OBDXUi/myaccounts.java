package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class myaccounts {

	private AppiumDriver driver;
	
	public myaccounts(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement myaccountsbutton() {
		return driver.findElement(PageElements.myaccountsbutton);
	}
	
	public WebElement viewdetails1() {
		return driver.findElement(PageElements.viewdetails1);
	}
	
	public WebElement viewtransactions() {
		return driver.findElement(PageElements.viewtransactions);
	}
	
	public WebElement viewdetails2() {
		return driver.findElement(PageElements.viewdetails2);
	}
	
	public WebElement backarrow() {
		return driver.findElement(PageElements.backarrow);
	}
	
	public WebElement optionslistbutton() {
		return driver.findElement(PageElements.optionslistbutton);
	}
	
	public void Myaccs() throws InterruptedException {
		impwait(20);
		myaccountsbutton().click();
		impwait(20);
		viewdetails1().click();
		Thread.sleep(3000);
		impwait(20);
		viewtransactions();
		Thread.sleep(3000);
		driver.navigate().back();
		impwait(20);
		viewdetails2().click();
		impwait(20);
		viewtransactions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(1000);
		impwait(20);
		backarrow().click();
		impwait(20);
		optionslistbutton().click();
		
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
}

