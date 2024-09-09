package _OBDXUi;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class obdx_run {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "14");
		desiredCapabilities.setCapability("deviceName", "Samsung S22 Ultra");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		desiredCapabilities.setCapability("app", "/Users/adc-qa/Downloads/app-debug.apk");
		desiredCapabilities.setCapability("noReset", "true");
		desiredCapabilities.setCapability("appPackage", "com.ofss.tx.meezan");
		desiredCapabilities.setCapability("appActivity", "com.ofss.digx.mobile.android.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		String sessionId = driver.getSessionId().toString();
		
		login Login = new login(driver);
		Login.loginaction("Sarfaraz1999", "Admin@1234");
		Thread.sleep(3000);
		
		showBalance showbalance = new showBalance(driver);
		showbalance.showBalanceAction();
		Thread.sleep(2000);
		
//		viewStatement viewstatement = new viewStatement(driver);
//		viewstatement.statement();
//		Thread.sleep(2000);
		
//		accountCard accCards = new accountCard(driver);
//		accCards.accCard();
//		Thread.sleep(2000);
		
//		fundtransfer fundstransfer = new fundtransfer(driver);
//		fundstransfer.FundTransfer();
//		Thread.sleep(2000);
//		
//		cardmanagement cards = new cardmanagement(driver);
//		cards.Cardmanagement();
//		Thread.sleep(2000);
		
//		raast Raastpay = new raast(driver);
//		Raastpay.Raast();
//		Thread.sleep(2000);
//		
		zakat Zakatpay = new zakat(driver);
		Zakatpay.Zakat();
		Thread.sleep(2000);
//		
//		amim AMIM = new amim(driver);
//		AMIM.amim_pay();
//		Thread.sleep(2000);
//		
//		payoneer Payoneer = new payoneer(driver);
//		Payoneer.payoneer_obdx();
//		Thread.sleep(2000);
//		
		payorder PayOrder = new payorder(driver);
		PayOrder.payOrder();
		Thread.sleep(2000);
		
//		chequemanagement Cheque = new chequemanagement(driver);
//		Cheque.ChequeManage();
//		Thread.sleep(2000);
		
		options Options = new options(driver);
		Options.obdx_options();
		
		//LogOut
		WebElement logout = driver.findElement(By.xpath("//android.widget.Image[@resource-id=\"log-out\"]"));
		logout.click();
		
		driver.quit();
		
	}

}
