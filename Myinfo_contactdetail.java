package miniproject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myinfo_contactdetail  {

	public static WebDriver driver;
	public static String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeTest
	public void driverSetUp()throws IOException
	{
		System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
  @Test
  public void f() throws InterruptedException
  {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(2000);
	  driver.findElement(By.name("username")).click();
	  Thread.sleep(2000);

	  driver.findElement(By.name("username")).sendKeys("Admin");
	     Thread.sleep(2000);

	  driver.findElement(By.name("password")).sendKeys("admin123");
	     Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	     Thread.sleep(2000);


	  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
	  Thread.sleep(2000);

	  Actions act=new Actions(driver);
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Narayan nagar");
     Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("Rajiv Gandhi IT Park");
	 Thread.sleep(2000);
	 
	  WebElement ck=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"));
	  ck.sendKeys(Keys.CONTROL,"A");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys("Pune");
	  

	 //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys("Pune");
	 Thread.sleep(2000);
      
	 
	  WebElement a = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"));
	  a.sendKeys(Keys.CONTROL,"A");
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Maharashtra");
	  Thread.sleep(2000);

	 
	  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Maharashtra");
      
	  
	  WebElement b = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"));
	  b.sendKeys(Keys.CONTROL,"A");
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys("412345");
	  
	  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys("412345");
      Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
	  Thread.sleep(2000);

	  Actions A=new Actions(driver);
	  A.sendKeys(Keys.ARROW_DOWN);
	  A.sendKeys(Keys.ARROW_DOWN);
	  A.sendKeys(Keys.ENTER).build().perform();  
	  
	  WebElement cr = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"));
	  cr.sendKeys(Keys.CONTROL,"A");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("02302481412");

	  
	 // driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("02302481412");
	  WebElement d = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));
	  d.sendKeys(Keys.CONTROL,"A");
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("9876452321");
 
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("9876452321");
	  //work
	  WebElement ab = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"));
	  //act.keyDown(baseUrl)
	  ab.sendKeys(Keys.CONTROL,"A");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys("1234-998876");
	  Thread.sleep(2000);
	  
	  WebElement ac = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));
	  ac.sendKeys(Keys.CONTROL,"A");
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("sad@gmail.com");
	  Thread.sleep(2000);

	  WebElement k=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input"));
	  k.sendKeys(Keys.CONTROL,"A");
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys("rais@gmail.com");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	  Thread.sleep(4000);

	  //email1
	  /*
	  WebElement a=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"));
	  act.doubleClick(a).perform();
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys("1234-998876");

	  WebElement n=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));
	  act.doubleClick(n).perform();
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("sam@gmail.com");
	  
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys("zen@gmail.com");
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	  */
	  
}
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }
}
