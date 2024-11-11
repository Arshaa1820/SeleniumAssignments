package Selenium_Assignments.Selenium_Assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice5_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.nopcommerce.com/en");

		List<WebElement> links = driver.findElements(By.tagName("a"));// 103

		int count = links.size();// 103

		System.out.println(count);
		
		//for each loop
		for (WebElement s : links) {
			//String lnk = s.getText();
			System.out.println("--Link Names---->>  " + s.getText());
		}

//		for (int i = 0; i < count; i++) {
//			String lnk = links.get(i).getText();
//			
//			System.out.println("----All Link Name from nopcommerce---- : " + lnk);
//
//		}

		driver.quit();

	}

}
