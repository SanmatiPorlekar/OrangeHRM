package miniproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Requirepment  {
	WebDriver driver;
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchEvaluatePerformanceReview";
	@BeforeTest
     public void setUp()
	{

		System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		
	@Test
	public void first() throws InterruptedException{ 
		driver.get(baseUrl);	
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		
	
		
		//Candidates	
	 driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")).click();
	 
	 //Job Title
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).click();
     Actions a=new Actions(driver);
     a.sendKeys(Keys.ARROW_DOWN); 
     
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
     //Vacancy
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")).click();
  
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
      //Hiring Manager
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")).click();
     
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
     //Status
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]")).click();
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
     //Candidate Name
     driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("A");
     Thread.sleep(2000);
	    Actions b=new Actions(driver);
	    b.sendKeys(Keys.ARROW_DOWN); 
	    b.sendKeys(Keys.ARROW_DOWN); 
	    b.sendKeys(Keys.ENTER).build().perform();
       Thread.sleep(5000);
     
     //Keywords
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("aws,dns");
     Thread.sleep(5000); 
     
     //Date of Application
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input")).sendKeys("2022-09-28");
     Thread.sleep(5000);
     
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input")).sendKeys("2022-10-28");
     Thread.sleep(5000);
     
     //Method of Application
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[2]")).click();
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
     //Search
     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")).click();
     Thread.sleep(5000);
     
     
     
     //Vacancies
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
Thread.sleep(5000);
 
	 //Job Title
	 driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")).click();
	 Thread.sleep(5000);
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
     //Vacancy
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")).click();
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
      //Hiring Manager
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")).click();
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
     
     //Status
     driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]")).click();
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ARROW_DOWN);
     a.sendKeys(Keys.ENTER).build().perform();
     Thread.sleep(5000);
		
	//search
     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();
		}

}

