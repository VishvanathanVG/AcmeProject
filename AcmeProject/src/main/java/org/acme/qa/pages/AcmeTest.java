package org.acme.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//input[@class ='form-control'])[1]").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementByXPath("(//input[@class ='form-control'])[2]").sendKeys("leaf@12");
		driver.findElementByXPath("//button[text()='Log In']").click();
		
		
		WebElement invoiceElement = driver.findElementByXPath("//button[text()=' Invoices']");
		Actions builder = new Actions(driver);
		builder.moveToElement(invoiceElement).perform();
		Thread.sleep(2000);
		driver.findElementByLinkText("Search for Invoice").click();
		driver.findElementById("vendorTaxID").sendKeys("DE763212");
		driver.findElementByXPath("//button[text()='Search']").click();
		
		List<WebElement> count = driver.findElementsByXPath("//table[@class='table']//tr//td[text()='IT Support']//preceding-sibling::td[2]");
		System.out.println("data size is:"+ count.size());
		for (WebElement eachInvoiceNumber : count) {
			
			System.out.println("Invoice number is:"+ eachInvoiceNumber.getText());
			
		}
		
	}

}
