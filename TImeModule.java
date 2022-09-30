package miniproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TImeModule{


	WebDriver driver;
	String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test(priority =1)
	public void logIn() throws InterruptedException {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	@Test(priority =2)
	public void Time() throws InterruptedException {
	//Time
	driver.findElement(By.linkText("Time")).click();
	
	
	//Employee NAme 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("a");
	Thread.sleep(5000);
	Actions z =new Actions(driver);
	z.sendKeys(Keys.ARROW_DOWN);
	z.sendKeys(Keys.ARROW_DOWN);
	z.sendKeys(Keys.ENTER).build().perform();
	//View
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")).click();
	Thread.sleep(4000);
	//Create timeSheet
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
	//Edit
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[1]")).click();
	//Type for hint
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[1]/div/div[2]/div/div/input")).sendKeys("a");
	Thread.sleep(4000);
	Actions y =new Actions(driver);
	y.sendKeys(Keys.ARROW_DOWN);
	y.sendKeys(Keys.ARROW_DOWN);
	y.sendKeys(Keys.ENTER).build().perform();
	//Select
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[2]/div/div[2]/div/div/div[2]/i")).click();
	Actions x =new Actions(driver);
	x.sendKeys(Keys.ARROW_DOWN);
	x.sendKeys(Keys.ARROW_DOWN);
	x.sendKeys(Keys.ENTER).build().perform();
	//Set the time
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[3]/div/div[2]/input")).sendKeys("12:00");
	
	//Save
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]")).click();
	
	Thread.sleep(4000);
	//Submit
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[2]")).click();
	
	}
	/*
	@Test(priority =)
	public void Time2() throws InterruptedException {
	// Record -> View
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")).click();
	Thread.sleep(4000);
	//SCroll
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(4000);
	//Edit
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[4]/div/div[2]/input")).sendKeys("04:00");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]")).click();
	
	}
	*/
	@Test(priority =3)
	public void Attendance() throws InterruptedException {
	//Attendance
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
	
	//Punch In 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]")).click();
	Thread.sleep(3000);
	//Punch In Commant
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys("Punch In/out");
	Thread.sleep(3000);
	//In Button
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")).click();
	Thread.sleep(4000);
	//Punch out Commant
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys("Punch In/Out");
	Thread.sleep(2000);
	//out Button
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")).click();
	Thread.sleep(2000);
	
	}
	@Test(priority=4)
	public void Reports() throws InterruptedException{
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	
	//project report
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
	Thread.sleep(1000);
	
	//Project name
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("a");
	Thread.sleep(4000);
	Actions x =new Actions(driver);
	x.sendKeys(Keys.ARROW_DOWN);
	x.sendKeys(Keys.ARROW_DOWN);
	x.sendKeys(Keys.ENTER).build().perform();
	// From Date
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-09-14");
	//To date
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2022-09-24");
	//Submit
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/button")).click();
	
	Thread.sleep(1000);
	//Result view full
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button/i")).click();
	
	
	
	
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	//Employee Report
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a")).click();
	//Employee Name
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("a");
	Thread.sleep(4000);
	Actions y =new Actions(driver);
	y.sendKeys(Keys.ARROW_DOWN);
	y.sendKeys(Keys.ARROW_DOWN);
	y.sendKeys(Keys.ENTER).build().perform();
	
	
	//project Name
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("a");
	Thread.sleep(4000);
	Actions z =new Actions(driver);
	z.sendKeys(Keys.ARROW_DOWN);
	z.sendKeys(Keys.ARROW_DOWN);
	z.sendKeys(Keys.ENTER).build().perform();
	
	//Activity Name:
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")).click();
	Thread.sleep(4000);

	Actions a =new Actions(driver);
	a.sendKeys(Keys.ARROW_DOWN);
	a.sendKeys(Keys.ARROW_DOWN);
	a.sendKeys(Keys.ENTER).build().perform();
	
	//from date
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-09-01");
	//TO date
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2022-09-21");
	//View Button
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[4]/button")).click();
	
	
	
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	//Advance Summary
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[3]/a")).click();
	//Employee Name 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("a");
	Thread.sleep(4000);
	Actions x1 =new Actions(driver);
	x1.sendKeys(Keys.ARROW_DOWN);
	x1.sendKeys(Keys.ARROW_DOWN);
	x1.sendKeys(Keys.ENTER).build().perform();
	
	
	//Job Title
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")).click();
	Thread.sleep(4000);

	Actions a1 =new Actions(driver);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ARROW_DOWN);
	a1.sendKeys(Keys.ENTER).build().perform();
	
	//Sub Unit
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")).click();
	Thread.sleep(4000);

	Actions a2 =new Actions(driver);
	a2.sendKeys(Keys.ARROW_DOWN);
	a2.sendKeys(Keys.ARROW_DOWN);
	a2.sendKeys(Keys.ENTER).build().perform();
	
	
	
	//Employee Status
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")).click();
	Thread.sleep(4000);

	Actions a3 =new Actions(driver);
	a3.sendKeys(Keys.ARROW_DOWN);
	a3.sendKeys(Keys.ARROW_DOWN);
	a3.sendKeys(Keys.ENTER).build().perform();
	
	
	//from date
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).sendKeys("2022-09-01");
	//TO date
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/input")).sendKeys("2022-09-21");

	//View Button
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/button")).click();
	}
	@Test(priority=5)
	public void projectInfo() throws InterruptedException {
		/*driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		//customers
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		//Add
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		//Name
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Customer1");
		//Description
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Description here");
		//Save 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		*/
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		//project
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[2]/a")).click();
		//customer name
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("a");
		Thread.sleep(4000);
		Actions x1 =new Actions(driver);
		x1.sendKeys(Keys.ARROW_DOWN);
		x1.sendKeys(Keys.ARROW_DOWN);
		x1.sendKeys(Keys.ENTER).build().perform();
		//project
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("a");
		Thread.sleep(4000);
		Actions x2 =new Actions(driver);
		x2.sendKeys(Keys.ARROW_DOWN);
		x2.sendKeys(Keys.ARROW_DOWN);
		x2.sendKeys(Keys.ENTER).build().perform();
		
		//project admin
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div/div[2]/div/div/input")).sendKeys("a");
		Thread.sleep(4000);
		Actions x3 =new Actions(driver);
		x3.sendKeys(Keys.ARROW_DOWN);
		x3.sendKeys(Keys.ARROW_DOWN);
		x3.sendKeys(Keys.ENTER).build().perform();
		
		//search button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	}
	
	@AfterTest
	public void tearDown() {
	driver.quit();
}
}

