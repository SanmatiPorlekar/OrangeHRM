package miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Performance_7 {
	WebDriver driver;
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchEvaluatePerformanceReview";
	
	@BeforeTest
	public void setUp()
	{

		System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(baseUrl);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*
	@Test(priority = 1)
	public void config() throws InterruptedException
	{
		//login
		driver.get(baseUrl);
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")).click();
		Thread.sleep(4000);
		
		//configure
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		 WebElement title = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]:"));
		title.click();
		title.sendKeys("h");
		Thread.sleep(2000);
		
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000");
		Thread.sleep(2000);
		
		//action sign click
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[7]/div/button[1]/i")).click();
		Thread.sleep(2000);
		//submit
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		//add
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")).click();
		Thread.sleep(2000);
		
		//performance indicator
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Tester");
		Thread.sleep(2000);
		//job title
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div")).sendKeys("f");
		Thread.sleep(2000);
		
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).perform();
		
		//save
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		// check newly added values
		//job title
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div")).sendKeys("f");
		Thread.sleep(1000);
		
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).perform();
		//serach click
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		//delete
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[7]/div/button[2]/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(4000);
		
	}
	*/
	
	@Test(priority = 1)
	public void ManageReview() throws InterruptedException
	{
		//manage performance review
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")).click();
		Thread.sleep(4000);
		
		Actions action = new Actions(driver);
		//manage review
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		//name
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[1]/div/div[2]/div/div/input")).sendKeys("Lisa Andrews");
		Thread.sleep(2000);
		
		//job title 
		WebElement j = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div[1]"));
		j.sendKeys("s");
		action.sendKeys(Keys.DOWN);
		action.sendKeys(Keys.DOWN);
		action.sendKeys(Keys.DOWN);
		
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		//review status
		WebElement status = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[3]/div/div[2]/div/div/div[1]"));
		status.click();
		action.sendKeys(Keys.DOWN);
		action.sendKeys(Keys.DOWN);
		action.sendKeys(Keys.DOWN);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		
		//reviewer
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[5]/div/div[2]/div/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[5]/div/div[2]/div/div/input")).sendKeys("Fiona Grace");
		Thread.sleep(3000);
		
		//from date
		/*
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[6]/div/div[2]/div/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[6]/div/div[2]/div/div/input")).sendKeys("2022-01-01");
		Thread.sleep(2000);
		//to date
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[7]/div/div[2]/div/div/input")).sendKeys("2022-12-31");
		Thread.sleep(2000);
		*/
		//search
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		
		/*
		//add
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		
		//name
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Simran");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/input")).sendKeys("Dipti");
		Thread.sleep(2000);
		
		//start date
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-09-05");
		Thread.sleep(2000);
		//end date
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2022-12-24");
		Thread.sleep(2000);
		
		//due date
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[3]/div/div[2]/div/div/input")).sendKeys("2022-12-30");
		Thread.sleep(2000);
		//save
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/button[2]")).click();
		Thread.sleep(2000);
		//added new data
		
		
		//search for new data
		*/
		
		
		
		
		//driver.quit();
		
	}
	
	@Test(priority = 2)
	public void WebTest() throws InterruptedException
	{
		
		//driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[1]/div/div[2]/div/div/input")).sendKeys("Dipti");
		//Thread.sleep(2000);
		
		//WebElement jobTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[2]/div/div[2]/div"));
		
		/*Actions action = new Actions(driver);
		//action.moveToElement(jobTitle).click();
		
		action.moveToElement(jobTitle).click();
		action.sendKeys("A").keyDown(Keys.CONTROL).build().perform();
		//action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		//action.keyDown(Keys.SHIFT);
		//action.sendKeys("A").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(4000);
		
		//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 * */
		 
		
		//MyTracker
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("view")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[1]/div/div[2]/input")).sendKeys("Positive");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[2]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[3]/div/div[2]/textarea")).sendKeys("Positive comment");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[4]/button[2]")).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority = 3)
	public void editDelete() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/li/button/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/li/ul/li[1]/p")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[4]/button[1]")).click();
		Thread.sleep(4000); 
		// JavascriptExecutor js = (JavascriptExecutor) driver;
         //js.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/li/button/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/li/ul/li[2]/p")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(4000);
		
		/*driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/li/button/i")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/li/ul/li[2]/p")).click();
		Thread.sleep(2000);
		*/
		
	}
	
	@Test(priority = 4)
	public void employeeTracker() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Charlie Carter");
		Thread.sleep(3000); 
		// JavascriptExecutor js = (JavascriptExecutor) driver;
         //js.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(4000);
		
		//negative test case
		/*
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")).click();
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Jack");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(4000);
		*/
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,4000)");
		//Thread.sleep(2000);
		
		driver.findElement(By.name("view")).click();
		Thread.sleep(5000);
		
		
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}

