package org.test.cts.test.TestngClass;

import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 extends BaseClass{


static POJOClass po;
	
	@BeforeClass
	
	private void Browserlan() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\TestngClass\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	private void StartTime() {
		
		Date d = new Date();
		System.out.println(d);

	}
	
	@Test (invocationCount=2)
	private void tc1() {
		
		driver.get("https://www.facebook.com/");
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		po = new POJOClass();
		
		sendval(po.getUserr(), "Twice");
		
		Assert.assertTrue(po.getUserr().getAttribute("value").equals("Twice"));
		
		sendval(po.getPas(), "1254752");
		
		clik(po.getBtn());
		
		
		}
	
	@Test (priority=-1)
	private void tc2() {
		
		driver.get("https://www.facebook.com/");
		
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		
		po = new POJOClass();
		
		SoftAssert a = new SoftAssert();
		
		sendval(po.getUserr(), "ImmanulRaja");
		
		a.assertEquals(po.getUserr().getAttribute("value"), "ImmanulRaj");
		
		sendval(po.getPas(), "1254752");
		
		clik(po.getBtn());
		
		a.assertAll();
		
		}
	
	

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
}
