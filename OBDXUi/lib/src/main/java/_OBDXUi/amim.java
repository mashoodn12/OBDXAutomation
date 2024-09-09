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

public class amim {
	
	private AppiumDriver driver;
	
	public amim(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void amim_pay() throws InterruptedException {
		impwait(30);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"SHOW BALANCE\"]"));
		WebElement amim_button = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Al Meezan Investment\"]"));
		amim_button.click();
		Thread.sleep(3000);
		impwait(20);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Invest\"]"));
//		performScroll(driver,525,2121,900);
//		Thread.sleep(3000);
//		performScrollUp(driver,525,740,700);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Page 2\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Page 3\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Page 8\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Page 10\"]")).click();
//		Thread.sleep(2000);
//		performScroll(driver,525,2121,1600);
//		Thread.sleep(2000);
//		performScrollUp(driver,525,326,1600);
		Thread.sleep(1000);
		WebElement invest = driver.findElement(By.xpath("//android.widget.Button[@text=\"Invest\"]"));
		invest.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Invest - Meezan Bank\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View")).click();
		Thread.sleep(3000);
		performScroll(driver,490,1317,520);
		Thread.sleep(1000);
		performScroll(driver,490,1317,520);
		Thread.sleep(1000);
		testTapByCoordinates("176399-2");
		Thread.sleep(1000);
		testTapByCoordinates("Continue");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Invest - Meezan Bank\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View")).click();
		Thread.sleep(2000);
		testTapByCoordinates("AL MEEZAN MUTUAL FUND");
		Thread.sleep(1000);
		testTapByCoordinates("MEEZAN ISLAMIC FUND");
		Thread.sleep(2000);
		testTapByCoordinates("Continue");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		impwait(10);
		WebElement investamount = driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Invest | amin-investment-invest-stage2\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText"));
		investamount.click();
		investamount.clear();
		investamount.sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.Button[@text=\"Next\"])[2]")).click();
		Thread.sleep(2000);
		impwait(10);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Accept\"]")).click();
		Thread.sleep(2000);
		impwait(10);
		WebElement investbtn = driver.findElement(By.xpath("//android.widget.Button[@text=\"Invest\"]"));
		investbtn.click();
		impwait(10);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"save-icon\"]")).click();
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Make Another Investment\"]")).click();
		
		//withdraw
		impwait(10);
		WebElement withdraw = driver.findElement(By.xpath("//android.widget.Button[@text=\"Withdraw\"]"));
		withdraw.click();
		Thread.sleep(3000);
		testTapByCoordinates("176399-900");
		Thread.sleep(1000);
		performScroll(driver,573,1039,750);
		Thread.sleep(1000);
		testTapByCoordinates("176399-2");
		Thread.sleep(1000);
		testTapByCoordinates("MEEZAN ISLAMIC INCOME FUND");
		Thread.sleep(1000);
		testTapByCoordinates("MEEZAN CASH FUND");
		Thread.sleep(1000);
		testTapByCoordinates("GROWTH-C");
		Thread.sleep(1000);
		testTapByCoordinates("GROWTH-C");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		impwait(10);
		WebElement withdrawamount = driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Redeem | amin-investment-redeem-stage2\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText"));
		withdrawamount.click();
		withdrawamount.clear();
		withdrawamount.sendKeys("1000");
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Accept\"]")).click();
		impwait(10);
		WebElement withdrawbtn = driver.findElement(By.xpath("//android.widget.Button[@text=\"Redeem\"]"));
		Thread.sleep(2000);
		withdrawbtn.click();
		impwait(30);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"save-icon\"]")).click();
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"home-icon-purple\"]")).click();
		Thread.sleep(3000);
		
		//convert
		driver.findElement(By.xpath("//android.view.View[@text=\"Al Meezan Investment\"]")).click();
		impwait(10);
		WebElement convert = driver.findElement(By.xpath("//android.widget.Button[@text=\"Convert\"]"));
		Thread.sleep(1000);
		convert.click();
		Thread.sleep(2000);
		testTapByCoordinates("176399-900");
		Thread.sleep(1000);
		performScroll(driver,530,1059,750);
		Thread.sleep(1000);
		testTapByCoordinates("176399-2");
		Thread.sleep(1000);
		testTapByCoordinates("MEEZAN ISLAMIC INCOME FUND");
		Thread.sleep(1000);
		testTapByCoordinates("MEEZAN CASH FUND");
		Thread.sleep(1000);
		testTapByCoordinates("GROWTH-C");
		Thread.sleep(1000);
		testTapByCoordinates("INCOME-C");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		Thread.sleep(2000);
		testTapByCoordinates("MEEZAN ISLAMIC INCOME FUND");
		Thread.sleep(1000);
		testTapByCoordinates("AL MEEZAN MUTUAL FUND");
		Thread.sleep(1000);
		testTapByCoordinates("GROWTH-B");
		Thread.sleep(1000);
		testTapByCoordinates("INCOME-B");
		Thread.sleep(1000);
		WebElement convertamount = driver.findElement(By.xpath("//android.webkit.WebView[@text=\"Convert | amin-investment-convert-stage2\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText"));
		convertamount.click();
		convertamount.clear();
		convertamount.sendKeys("1000");
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Accept\"]")).click();
		impwait(10);
		WebElement convertbtn = driver.findElement(By.xpath("//android.widget.Button[@text=\"Convert\"]"));
		Thread.sleep(1000);
		convertbtn.click();
		impwait(30);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"save-icon\"]")).click();
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"home-icon-purple\"]")).click();
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
	
	public static void performScrollUp(AppiumDriver driver, int x, int y, int move) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(x, y))
                .moveTo(PointOption.point(x, y + move)) // Adjust the distance to scroll as needed
                .release()
                .perform();
    }
	
	public static void performtap(AppiumDriver driver, int x, int y) {
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		touchAction.press(PointOption.point(x,y)).release().perform();
	}
	
	public void testTapByCoordinates(String texttomatch) {
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
