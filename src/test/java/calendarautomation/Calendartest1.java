package calendarautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class Calendartest1 {


	@SuppressWarnings("unused")
	
	private static AndroidDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
		capabilities .setCapability("AutomationName", "Appium");
		
		capabilities .setCapability("PlatformName", "Android");
		
		capabilities .setCapability("PlatformVersion","7.1.1");
		
		capabilities .setCapability("deviceName","Android"); //android emulator for virtual devices
	   
	 
		
		capabilities .setCapability("appPackage", "com.google.android.calculator");
		
		capabilities .setCapability("appActivity", "com.android.calculator2.Calculator");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000); 
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"multiply\"]")).click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"8\"]")).click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		Thread.sleep(2000);

		
		String result = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		
		
		if(result.equals("8"))
			
			
			System.out.println("test case passed");
		
		else {
			
			System.out.println("test case failed");
			
		}
		
		Thread.sleep(5000);
		
		driver.close();

		driver.quit();
		

		
	}

}
