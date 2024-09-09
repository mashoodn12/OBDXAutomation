package _OBDXUi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class chequemanagement {

	private AppiumDriver driver;
	
	public chequemanagement(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public void ChequeManage() {
		impwait(30);
		WebElement chequebtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Cheque Management\"]"));
		chequebtn.click();
		
		//cheque status
		
		//cheque book request
		
		//cheque block/unblock
		
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
}

