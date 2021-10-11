package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("UserFirstName")).sendKeys("Christy");
		driver.findElement(By.name("UserLastName")).sendKeys("Stanley");
		driver.findElement(By.name("UserEmail")).sendKeys("hurry2christy@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Amazon");
		driver.findElement(By.name("UserPhone")).sendKeys("9012345678");
		//for job title dropdown
		WebElement eleJob = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dd1=new Select(eleJob);
		dd1.selectByIndex(7);
		//for Employees dropdown
		WebElement eleEmp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dd2=new Select(eleEmp);
		dd2.selectByValue("1600");
		//for Country dropdown
		WebElement eleCon = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dd3=new Select(eleCon);
		dd3.selectByVisibleText("India");
		//for checkbox selection
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.close();
	
	}

}
