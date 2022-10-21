package calendarautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Dialtest {
	
@SuppressWarnings("unused")
private static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, Exception {
		
		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setCapability("AutomationName", "Appium");
		
		capability.setCapability("platformName", "Android");
		
		capability.setCapability("platformVersion", "7.1.1");
		
		capability.setCapability("deviceName", "Android");
		
		capability .setCapability("appPackage", "com.android.dialer");
		
	     capability.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"dial pad\"]")).click();
		
		Thread.sleep(3000);
		
		//
		
		driver.findElement(By.id("com.android.dialer:id/eight")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("com.android.dialer:id/six")).click();
		
		Thread.sleep(1000);

	
		driver.findElement(By.id("com.android.dialer:id/three")).click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("com.android.dialer:id/nine")).click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("com.android.dialer:id/nine")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.id("com.android.dialer:id/one")).click();
		
		Thread.sleep(1000);

		
		
		driver.findElement(By.id("com.android.dialer:id/nine")).click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("com.android.dialer:id/four")).click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("com.android.dialer:id/zero")).click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("com.android.dialer:id/eight")).click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
		
		Thread.sleep(5000);

		
		driver.findElement(By.id("com.android.dialer:id/floating_end_call_action_button")).click();
		
		
		driver.quit();
	}

}
