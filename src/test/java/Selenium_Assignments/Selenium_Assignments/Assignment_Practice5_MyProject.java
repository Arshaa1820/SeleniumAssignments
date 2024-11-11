package Selenium_Assignments.Selenium_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice5_MyProject{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.manage().window().maximize();	//maximize window
		driver.manage().deleteAllCookies();		//delete all cookies
		
		driver.get("https://www.nopcommerce.com/en");
		driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
		
		driver.close();

	}

}
