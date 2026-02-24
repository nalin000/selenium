package introduction;
   

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
   public static void main(String[]args) {
	   
	   WebDriver driver=new ChromeDriver();
	   //implicit wait mechanism
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_auce");
//		driver.findElement(By.id("login-button")).click();
//		System.out.println(
//			    driver.findElement(By.cssSelector("h3[data-test='error']")).getText()
//			);

//			driver.findElement(By.linkText("Forgot your password?")).click();
		
//
//			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@gmail.com");
			//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("12345678");
			
			//to clear the placeholder
			//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
			
			//for giving index 
			//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("12345678");
			
//			driver.findElement(By.xpath("//form/input[3]")).sendKeys("1345678");
//			driver.findElement(By.className("reset-pwd-btn")).click();
//			
//			System.out.println(
//				    driver.findElement(By.className("infoMsg")).getText()
//			);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Nalin");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
   }
	
}
