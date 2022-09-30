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

public class Admin_Organization  {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testWeb() throws InterruptedException, AWTException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		
		//Admin
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		//Job
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		Thread.sleep(2000);
		
		//Locations
		driver.findElement(By.xpath("//a[normalize-space()='Locations']")).click();
		Thread.sleep(2000);
		
		//Search organization
		driver.findElement(By.xpath("//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//input[1]")).sendKeys("Texas R&D");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("Texas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).sendKeys("uuuuu");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		System.out.println("Test 1 passed");
	}
	@Test
	public void testWeb2() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		//Adding details
		driver.findElement(By.xpath("//div[@class='orangehrm-card-container']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]")).sendKeys("Persistent Systems");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-layout-context']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//input[1]")).sendKeys("Maharastra");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//input[1]")).sendKeys("533228");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[5]/div/div[2]/input")).sendKeys("9885432575");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[6]/div/div[2]/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[7]/div/div[2]/textarea")).sendKeys("Best Organization");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[8]/div/div[2]/textarea")).sendKeys("Notes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/div[1]")).sendKeys("ii");
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		System.out.println("Test 2 passed");
	}
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
