package Mohan.Nepal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Kafle {

	public static void main(String[] args) {
		 
		 
		 
		 WebDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		   
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();  
		  
		 driver.findElement(By.id("email")).sendKeys("mohan123@gmail.com");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mohan@123");
		 driver.findElement(By.xpath("//button[@value='1']")).click();
		 System.out.println(driver.findElement(By.id("error_box")).getText());
		 driver.findElement(By.linkText("Forgot password?")).click();
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		 driver.quit();  
	    
		  
	} 

}
