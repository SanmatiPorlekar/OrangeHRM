package miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
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

public class Admin_Job {
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
	public void addJobTitle() throws InterruptedException, AWTException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		//Admin
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		//Job
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
		Thread.sleep(2000);
		//Job Titles
		driver.findElement(By.xpath("//a[normalize-space()='Job Titles']")).click();
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		//Job Title
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Devops Engineer");
		Thread.sleep(2000);
		//Job Description
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Managing all the product");
		Thread.sleep(2000);
		//submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	
	@Test(priority=2)
    public void deleteJobTitle() throws InterruptedException, AWTException {



   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[1]/i")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]")).click();
  
	}
    
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

