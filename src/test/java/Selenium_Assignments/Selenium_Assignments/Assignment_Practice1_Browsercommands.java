package Selenium_Assignments.Selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice1_Browsercommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		String url = driver.getCurrentUrl();
		System.out.println("-----url----" + url);
		String title = driver.getTitle();
		System.out.println("------title----" + title);
		driver.close();

	}

}

