package org.acme.qa.baseAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.acme.qa.base.SeleniumBase;
import org.acme.qa.utils.LearnReadDataExcelOwn;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods extends SeleniumBase{

	
	@BeforeMethod
	public void login() {
		
		startApp("chrome", "https://acme-test.uipath.com/account/login");
		/*System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
	}
	
	@AfterMethod
	public void tearDown() {
		 
		driver.close();
	}
	
	@DataProvider(name="acmeData")
	public String[][] setUpData() throws IOException {
		
		LearnReadDataExcelOwn readData = new LearnReadDataExcelOwn();
		String[][] readDataExcel = readData.readDataExcel(ExcelFileName, Sheetname);
		return readDataExcel;
	}
}
