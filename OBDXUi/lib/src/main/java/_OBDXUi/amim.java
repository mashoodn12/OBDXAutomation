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
	
	public WebElement amim_button() {
		return driver.findElement(PageElements.amim_button);
	}
	
	public WebElement invest_option() {
		return driver.findElement(PageElements.invest_option);
	}
	
	public WebElement continue_button() {
		return driver.findElement(PageElements.continue_button);
	}
	
	public WebElement portfolio_number() {
		return driver.findElement(PageElements.portfolio_number);
	}
	
	public WebElement fundplan() {
		return driver.findElement(PageElements.fundplan);
	}
	
	public WebElement fundclass() {
		return driver.findElement(PageElements.fundclass);
	}
	
	public WebElement amim_next() {
		return driver.findElement(PageElements.amim_next);
	}
	
	public WebElement accept() {
		return driver.findElement(PageElements.accept);
	}
	
	public WebElement invest_button() {
		return driver.findElement(PageElements.invest_button);
	}
	
	public WebElement makeanotherinvestment() {
		return driver.findElement(PageElements.makeanotherinvestment);
	}
	
	public WebElement withdraw_option() {
		return driver.findElement(PageElements.withdraw_option);
	}
	
	public WebElement w_portfolio_number() {
		return driver.findElement(PageElements.w_portfolio_number);
	}
	
	public WebElement w_fundplan() {
		return driver.findElement(PageElements.w_fundplan);
	}
	
	public WebElement redeem_button() {
		return driver.findElement(PageElements.redeem_button);
	}
	
	public WebElement convert_option() {
		return driver.findElement(PageElements.convert_option);
	}
	
	public WebElement c_portfolio_number() {
		return driver.findElement(PageElements.c_portfolio_number);
	}
	
	public WebElement c_fundplan() {
		return driver.findElement(PageElements.c_fundplan);
	}
	
	public WebElement c_fundclass() {
		return driver.findElement(PageElements.c_fundclass);
	}
	
	public WebElement show_balance() {
		return driver.findElement(PageElements.show_balance);
	}
	
	public WebElement next_button() {
		return driver.findElement(PageElements.next_button);
	}
	
	public WebElement amount() {
		return driver.findElement(PageElements.amount);
	}
	
	public WebElement save() {
		return driver.findElement(PageElements.save);
	}
	
	public WebElement homebutton() {
		return driver.findElement(PageElements.homebutton);
	}
	
	
	public void amim_pay() throws InterruptedException {
		impwait(30);
		show_balance();
		amim_button().click();
		Thread.sleep(3000);
		impwait(20);
		
		//invest
		investfunction();
		
		//withdraw
		redeemfunction();
		
		//convert
		convertfunction();
		
		homebutton().click();
		
	}
	
	public void investfunction() throws InterruptedException {
		invest_option().click();
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
		continue_button().click();
		Thread.sleep(1000);
		next_button().click();
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		impwait(10);
		amount().click();
		amount().clear();
		amount().sendKeys("1000");
		Thread.sleep(2000);
		amim_next().click();
		Thread.sleep(2000);
		impwait(10);
		accept().click();
		Thread.sleep(2000);
		impwait(10);
		invest_button().click();
		impwait(10);
		save().click();
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(2000);
		makeanotherinvestment().click();		


	}
	
	public void redeemfunction() throws InterruptedException {
		impwait(10);
		withdraw_option().click();
		Thread.sleep(3000);
		next_button().click();
		impwait(10);
		amount().click();
		amount().clear();
		amount().sendKeys("1000");
		next_button().click();
		Thread.sleep(2000);
		accept().click();
		impwait(10);
		redeem_button().click();
		impwait(30);
		save().click();
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(1000);
		homebutton().click();
		Thread.sleep(3000);
		
	}
	
	public void convertfunction() throws InterruptedException {
		amim_button().click();
		impwait(10);
		convert_option().click();
		Thread.sleep(2000);
//		testTapByCoordinates("176399-900");
//		Thread.sleep(1000);
//		performScroll(driver,530,1059,750);
//		Thread.sleep(1000);
//		testTapByCoordinates("176399-2");
//		Thread.sleep(1000);
//		testTapByCoordinates("MEEZAN ISLAMIC INCOME FUND");
//		Thread.sleep(1000);
//		testTapByCoordinates("MEEZAN CASH FUND");
//		Thread.sleep(1000);
//		testTapByCoordinates("GROWTH-C");
//		Thread.sleep(1000);
//		testTapByCoordinates("INCOME-C");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
//		Thread.sleep(2000);
//		testTapByCoordinates("MEEZAN ISLAMIC INCOME FUND");
//		Thread.sleep(1000);
//		testTapByCoordinates("AL MEEZAN MUTUAL FUND");
//		Thread.sleep(1000);
//		testTapByCoordinates("GROWTH-B");
//		Thread.sleep(1000);
//		testTapByCoordinates("INCOME-B");
//		Thread.sleep(1000);
		amount().click();
		amount().clear();
		amount().sendKeys("1000");
		next_button().click();
		Thread.sleep(2000);
		accept().click();
		impwait(10);
		WebElement convertbtn = driver.findElement(By.xpath("//android.widget.Button[@text=\"Convert\"]"));
		Thread.sleep(1000);
		convertbtn.click();
		impwait(30);
		save().click();
		Thread.sleep(2000);
		testTapByCoordinates("Close");
		Thread.sleep(2000);
	
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
