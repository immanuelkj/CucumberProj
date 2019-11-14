package org.test.cts.test.TestngClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends BaseClass{
	
	static POJOClass po;
	
	
	
	
	
	@Test
	
	private void tc22() throws IOException {
		
		String [][] arr = null ;
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
				
				arr[i][j] = val;
				
				System.out.println(arr[i][j]);
				
				
				
				//sendval(po.getUserr(), );
				//sendval(po.getPas(), a);

	}
		}
		
		
		
		
	}
	
		
		
		
	
	
	
	
}
