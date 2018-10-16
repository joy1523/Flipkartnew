package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart {
WebDriver driver;
@BeforeClass
public void beforeclass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ebenezer\\eclipse-workspace\\JoyEbenezer\\TestNG\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
}
@AfterClass
public void afterclass() {
driver.quit();
}
@Test
public void test() throws InterruptedException {
	Thread.sleep(3000);
	WebElement btnClose=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	btnClose.click();
}
@Test
public void test1() throws InterruptedException {
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Home & Furniture",Keys.ENTER);
	//Actions acc=new Actions(driver);
	//acc.moveToElement(btnShop).perform();
	Thread.sleep(3000);
	WebElement btnMobile=driver.findElement(By.xpath(("(//img[@class='_1Nyybr  _30XEf0'])[1]")));
	btnMobile.click();
}
@Test
public void test2() {
	String pWid=driver.getWindowHandle();
	Set<String> allWindows=driver.getWindowHandles();
	//int count=0;
	for(String x:allWindows)
	{
		if(!pWid.equals(x))
		{
			driver.switchTo().window(x);
		}
	}
	
WebElement btnClick=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
btnClick.click();
}
}

