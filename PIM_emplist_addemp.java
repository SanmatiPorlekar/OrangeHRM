package miniproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class PIM_emplist_addemp{
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
		
		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Sai Surya Teja");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Chavatapalli");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"))).build().perform();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("554271");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style', arguments[1])",driver.findElement(By.xpath("//input[@type='file']")), "0");
		js.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("//input[@type='file']/../../div[2]")), "a");
		//profile pic
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\simran_babasab\\Desktop\\miniproject\\anime.png");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);

//		driver.findElement(By.xpath("//a[normalize-space()='Personal Details']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-01-26");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).sendKeys("ssss");
//		Actions act2=new Actions(driver);
//		act2.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]")).sendKeys("fff");
//		act2.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/div[1]")).sendKeys("e");
//		act2.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[9]/a")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("jo");
//		Thread.sleep(4000);
//		act2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void testWeb2() throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("554271");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	}
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

