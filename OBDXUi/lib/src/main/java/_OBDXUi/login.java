package _OBDXUi;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;


public class login {

	private AppiumDriver driver;

		public login(AppiumDriver driver) {
			this.driver = driver;
		}
		
		public WebElement userIdElement() {
			return driver.findElement(PageElements.login_username);
		}
		
		public WebElement passwordElement() {
			return driver.findElement(PageElements.login_password);
		}
		
		public WebElement loginButton() {
			return driver.findElement(PageElements.login_button);
		}
		
		public void loginaction(String username, String password) throws InterruptedException {
//			Thread.sleep(20000);
			//driver.findElement(By.xpath("//android.webkit.WebView")).click();
			impwait(40);
			userIdElement().click();
			userIdElement().clear();
			userIdElement().sendKeys(username);
			
			passwordElement().click();
			passwordElement().sendKeys(password);
			
			loginButton().click();
			
		}

		private void impwait(int duration) {
			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		}
}
