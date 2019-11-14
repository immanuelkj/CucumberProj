package org.test.cts.test.TestngClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.constant.FieldConstant;

public class BaseClass {

	static WebDriver driver;
	
	static int rowscount, cellscount;
	
	
	public static WebDriver Browerlan() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\BaseClass\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		return driver;
	}
	
	public static void getUrl(String url) {
		
		driver.get(url);

	}
	
	public static WebElement findElementByXpath(String id) {
		
		WebElement element = driver.findElement(By.xpath(id));
		
		return element;
	}
	
	public static void sendval(WebElement e, String a) {
	
		e.sendKeys(a);

	}
	
	public static void btnclick(WebElement ee) {
		ee.click();
		
	}
	
	
	public static String getTextmethod(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	
	
	public static List<WebElement> Dropdownaction(WebElement dropdownWElement, String selectText) {
		
		Select s = new Select(dropdownWElement);
		
		s.selectByVisibleText(selectText);

		List<WebElement> options = s.getOptions();
		
		return options;
	}
	
	public static void ScrollDown(WebElement e) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", e);

	}
	
public static String[][] readExcel() throws IOException {
	
		String [][] arr = null;
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\TestngClass\\excel\\33.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet s = book.getSheet("Sheet1");
		
		int rowscount = s.getPhysicalNumberOfRows();
		
		for (int i = 0; i < rowscount; i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = r.getCell(j);
				
				String val = cell.getStringCellValue();
				
				  arr = new String[rowscount][r.getPhysicalNumberOfCells()];
				
				arr [i][j] = val;
				
			}
			
		}
		return arr;
		
		

	}
	
	public static void ReadWebt() {
		String text="";
		List<WebElement> Trows = driver.findElements(By.tagName("tr"));
		
		for (int i = 0; i < Trows.size(); i++) {
			
			WebElement rows = Trows.get(i);
			
			List<WebElement> Tdata = rows.findElements(By.tagName("th"));
			
			for (int j = 0; j < Tdata.size(); j++) {
				
				WebElement data = Tdata.get(j);
				 text = data.getText();
				
				System.out.println(text);
				
			}
			
		}


	}
	
	
	
	


	public static void clik(WebElement ee) {
		ee.click();

	}
	
	
}
