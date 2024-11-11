package Selenium_Assignments.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Practice4_chkbox_radio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		boolean hm = driver.findElement(By.xpath("//span[@id='home']")).isDisplayed();
		System.out.println("----Is Home tab is displaying?----- :" + hm); //true
		
		boolean btn1 = driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
		System.out.println("----is Button1 is enabled?-----:" + btn1 ); //false
		
		boolean btn2 = driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
		System.out.println("-----is Button 2 is enabled?-----" + btn2); //true
		
		boolean chkbox1 = driver.findElement(By.xpath("//input[@value='Book']")).isSelected();
		System.out.println("-----Book check box is selected-----" + chkbox1); //true
		
		boolean chkbox2 = driver.findElement(By.xpath("(//input[@value='Pen'])[2]")).isSelected();
		System.out.println("-----Pen checkbox is selected-----" + chkbox2); //false
		
		boolean chkbox3 = driver.findElement(By.xpath("//input[@value='Bag']")).isSelected();
		System.out.println("---Bag checkbox is selected----" + chkbox3); //false
		
		boolean rdbtn1 = driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
		System.out.println("----Bicycle Radio buttn selected----" + rdbtn1); //true
		
		boolean rdbtn2 = driver.findElement(By.xpath("//input[@value='Car']")).isSelected();
		System.out.println("-----Car Radio btn selected-----" + rdbtn2);  //false
		
		driver.close();

	}

}
