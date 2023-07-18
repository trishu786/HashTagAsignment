package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashTagEnBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		driver.manage().window().maximize();
		WebElement EnBtn=driver.findElement(By.xpath("//button[@class='btn-transparent btn-header-1 btn btn-outline-success my-2 my-sm-0']//a[normalize-space()='En']"));
		EnBtn.click();
		
		

	}

}
