package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;


public class showBalance {

	private AppiumDriver driver;
	
	public showBalance(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public WebElement balanceElement() {
		return driver.findElement(PageElements.show_balance);
	}
	
	public void showBalanceAction() throws InterruptedException {
		impwait(30);
		balanceElement().click();
		Thread.sleep(3000);
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

}

