package Selenium_Assignments.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice3_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='PracticePage']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='selectors-input jsSelector'])[1]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Test!#pass");
		driver.findElement(By.xpath("(//input[@placeholder='Enter your company'])[1]")).sendKeys("KDHA");
		driver.findElement(By.xpath("(//input[@name='mobile number'])[1]")).sendKeys("987747854");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		
		System.out.println("--------Entered all text-------");
	driver.close();
		
		
	}

}
