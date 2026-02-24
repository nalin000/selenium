package introduction;



import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver=new FirefoxDriver();
		   //implicit wait mechanism
		 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 String pass2=  getPassword(driver);
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   
		   
		   driver.findElement(By.id("inputUsername")).sendKeys("Nalin");
			driver.findElement(By.name("inputPassword")).sendKeys(pass2);
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.id("chkboxTwo")).click();
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(1000);
			System.out.println(
					driver.findElement(By.tagName("p")).getText()
					);
			
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();


	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   driver.findElement(By.linkText("Forgot your password?")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.className("reset-pwd-btn")).click();
			
			String passwordText = driver.findElement(By.className("infoMsg")).getText();
			String[]passwordArray=passwordText.split("'");
			String pass =   passwordArray[1].split("'")[0];
			return pass;
	}

}
