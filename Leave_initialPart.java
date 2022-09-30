package miniproject;
	import java.awt.Desktop.Action;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	//import io.github.bonigarcia.wdm.WebDriverManager;

	public class Leave_initialPart{
		WebDriver driver;
		String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		@BeforeTest
		public void setUp() {
			
			System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		@Test
		public void logIn() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		

		//Leave
		driver.findElement(By.linkText("Leave")).click();
		//Apply the leave
			driver.findElement(By.linkText("Apply")).click();
			//Leave Type
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).click();
			Thread.sleep(4000);
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ARROW_DOWN);
			a.sendKeys(Keys.ARROW_DOWN);
			
			a.sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(5000);
			//From the date
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-09-13");
			//to date
			//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys("");
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")).click();
			
			//Duration
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div/div[1]")).click();
			Actions a1=new Actions(driver);
			a1.sendKeys(Keys.ARROW_DOWN);
			a1.sendKeys(Keys.ARROW_DOWN);
			
			a1.sendKeys(Keys.ENTER).build().perform();
			
			//Apply
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button")).click();

		
		//--------Working
		//My Leave
		driver.findElement(By.linkText("My Leave")).click();
		
		//From Date
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-09-01");
		
		//TO Date
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2022-09-21");
		
		
		//Reject DeSelect,cancled, pending approval
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i")).click();
		
		
		//Select the deselected one
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]")).click();
		Actions e=new Actions(driver);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//Leave Type
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
		Actions d=new Actions(driver);
		d.sendKeys(Keys.ARROW_DOWN);
		d.sendKeys(Keys.ARROW_DOWN);
		d.sendKeys(Keys.ENTER).build().perform();
		
		
		Thread.sleep(3000);
		//Search Button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		
		
		
		

		
		//Reports
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		
		//Leave Entitlement and REports
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		
		//Employee
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/div/label")).click();
		
		//Employee NAme 
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("a");
		Thread.sleep(5000);
		Actions x=new Actions(driver);
		x.sendKeys(Keys.ARROW_DOWN);
		x.sendKeys(Keys.ARROW_DOWN);
		x.sendKeys(Keys.ENTER).build().perform();
		
		//DAte Selection
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")).click();
		Actions y =new Actions(driver);
		y.sendKeys(Keys.ARROW_DOWN);
		y.sendKeys(Keys.ARROW_DOWN);
		y.sendKeys(Keys.ENTER).build().perform();
		
		
		
		//Generate
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/button")).click();
		//Scroll For result
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button/i")).click();
		
		
		
		
		
		
		
		//---------Working
		//*Leave List
		driver.findElement(By.linkText("Leave List")).click();
		//Click on from date
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/i"));
		//select the start date
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-08-25");
		//select the end date
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2022-08-26");
		
		//click on arrow
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
		Thread.sleep(5000);
		
		//click on field
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
		//Action

		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		//Employee Detail
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("a");
		Thread.sleep(5000);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ARROW_DOWN);
		act1.sendKeys(Keys.ENTER).build().perform();
		//SubUnit
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")).click();
		Thread.sleep(4000);
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.ARROW_DOWN);
		act2.sendKeys(Keys.ARROW_DOWN);
		act2.sendKeys(Keys.ARROW_DOWN);
		act2.sendKeys(Keys.ENTER).build().perform();
		
		//search button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")).click();
		
		
		
		driver.findElement(By.linkText("Leave List")).click();
		//Approve 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[9]/div/button[1]")).click();
		Thread.sleep(5000);
		
		//Reject the request
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div/div[9]/div/button[2]")).click();
		Thread.sleep(5000);
		
		
		}

		@AfterTest
		public void tearDown() {
		//driver.quit();
	}
		
	}
	