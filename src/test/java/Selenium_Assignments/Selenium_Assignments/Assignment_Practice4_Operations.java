package Selenium_Assignments.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice4_Operations {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("----Page title is : " + title);
		String url = driver.getCurrentUrl();
		System.out.println("----Current page url :" + url);
		WebElement wb = driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']"));
		String txt = wb.getText();
		String clr = wb.getCssValue("color");
		System.out.println("---------Signin Text---------" + txt);
		System.out.println("---------Signin Text---------" + clr);
	
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("peter");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Kevin");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("USA");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Texas");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Hypus");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("56");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("98547854");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("987458745874");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("arshu1820");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("arshu1820");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("arshu1820");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
