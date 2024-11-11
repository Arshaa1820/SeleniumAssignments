package Selenium_Assignments.Selenium_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice5_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(); // launch chrome browser

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all cookies

		// Dynamic wait

//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(3000);

		List<WebElement> suggestions = driver
				.findElements(By.xpath("(//ul[@role='listbox'])//li/descendant::div[@class='wM6W7d']"));
		int count = suggestions.size();
		System.out.println("---Suggestions count is " + count);

		for (WebElement s : suggestions) {
			String sug = s.getText();
			System.out.println(sug);

			if (sug.contains("selenium webdriver")) {
				s.click();
				break;
			}
		}

		driver.close();

	}

}
