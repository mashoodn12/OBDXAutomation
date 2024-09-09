package _OBDXUi;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class payoneer {

	private AppiumDriver driver;
	
	public payoneer(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public void payoneer_obdx() {
		impwait(10);
		WebElement payoneer_button = driver.findElement(By.xpath("//android.view.View[@text=\"Payoneer\"]"));
		payoneer_button.click();
		impwait(10);
		WebElement accept = driver.findElement(By.xpath("//android.widget.Button[@text=\"Accept\"]"));
		accept.click();
		
		//
		
	}
	
	private void impwait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

}

