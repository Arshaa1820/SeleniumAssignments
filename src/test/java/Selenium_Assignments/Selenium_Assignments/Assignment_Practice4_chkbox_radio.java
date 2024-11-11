package Selenium_Assignments.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice4_chkbox_radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/");
		driver.findElement(By.xpath("//a[normalize-space()='PracticePage']")).click();
		Thread.sleep(3000);
		
		// is enabled check
		WebElement wb = driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
		boolean txtbox = wb.isEnabled();
		System.out.println("---First Name textbox is enabled---" + txtbox);

		//is displayed check
		WebElement wb1 = driver.findElement(By.xpath("//input[@id='datepicker']"));
		boolean txtbox1 = wb1.isDisplayed();
		System.out.println("----Pick date textbox is displaying----:" + txtbox1);
		
		//Verify Check box is selected or not
		WebElement chb = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
		boolean chbox = chb.isSelected();
		System.out.println("----CheckBox is Selected---- :" + chbox);
		
		driver.close();

	}

}
