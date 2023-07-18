package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.InvalidArgumentException;
public class HashTagAssignment  {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
		
		name.sendKeys("GAYATRI SEWANI");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		
		email.sendKeys("gayatrisewani90@gmail.com");
		
		WebElement phoneNumber=driver.findElement(By.xpath("//input[@type='number']"));
		
		phoneNumber.sendKeys("7387910099");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)");

		Thread.sleep(3000);
		 
		WebElement resume=driver.findElement(By.xpath("//input[@name='resume']"));
		
		resume.sendKeys("D:\\myInfo.txt");
		
		WebElement describeYourself=driver.findElement(By.cssSelector("textarea.form-control.hash-input"));
	
		describeYourself.sendKeys("Hello, I am Gayatri Sewani");
		
		WebElement applyNow=driver.findElement(By.xpath("//button[text()='APPLY NOW']"));
	
		applyNow.click();
	}

}
