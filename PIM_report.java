package miniproject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class PIM_report {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		
		
		System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void testWeb() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		//PIM
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Reports']")).click();
		Thread.sleep(2000);
		//Click Add Report button
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		Thread.sleep(2000);
		//Report name
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")).sendKeys("Teja Report");
		Thread.sleep(2000);
		WebElement selCrit=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		selCrit.click();
		selCrit.sendKeys(Keys.ARROW_DOWN);
		selCrit.sendKeys(Keys.ARROW_DOWN);
		selCrit.sendKeys(Keys.ENTER);
		
		WebElement include=driver.findElement(By.xpath("//div[contains(text(),'Current Employees Only')]"));
		include.click();
		include.sendKeys(Keys.ARROW_DOWN);
		include.sendKeys(Keys.ARROW_DOWN);
		include.sendKeys(Keys.ENTER);
		
		//DisplayFields_group
		WebElement dfg=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]"));
		dfg.sendKeys(Keys.ARROW_DOWN);
		dfg.sendKeys(Keys.ARROW_DOWN);
		dfg.sendKeys(Keys.ARROW_DOWN);
		dfg.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/i")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		//Plus symbol
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[2]//div[2]//div[2]//button[1]//i[1]")).click();
		Thread.sleep(2000);
		//Save
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=2)
	public void testWeb2() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("T");
		Thread.sleep(2000);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

