package introduction;


import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;



public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		// AutomationPractice me Login wala button pe jane keliye 
		System.out.println(
				driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()
				);
	}

}
