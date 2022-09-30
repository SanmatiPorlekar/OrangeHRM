package miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignleave {
	 private WebDriver driver;
	    public static String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		@BeforeTest
		public void setUp() throws Exception {
		    System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			Dimension d = new Dimension(1000,900);
			driver.manage().window().setSize(d);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseUrl);
		}
		
		@Test
		public void testWeb() throws Exception{
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(1000);
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		    driver.findElement(By.linkText("Leave")).click(); 
		    Thread.sleep(1000);
		    //more
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[6]/span")).click();
		    Thread.sleep(1000); 
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[6]/ul/div[2]/li/a")).click(); 
		    Thread.sleep(1000);
		    //name
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("p");  
		    Thread.sleep(2000);
		    Actions b=new Actions(driver);
		    b.sendKeys(Keys.ARROW_DOWN); 
		    b.sendKeys(Keys.ARROW_DOWN); 
		    b.sendKeys(Keys.ENTER).build().perform();
		    
		   //Leave type
		   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]")).click();  
		 //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]
		   Actions a=new Actions(driver);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ARROW_DOWN);
		    a.sendKeys(Keys.ENTER).build().perform(); 
		    Thread.sleep(2000);
		    
		   //from date  
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-09-05");  
		   Thread.sleep(2000);
		   //to date
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input")).click(); 
		   Thread.sleep(2000);
		  //Duration
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/div/div/div[1]")).click(); 
		    Actions a1=new Actions(driver);
		    a1.sendKeys(Keys.ARROW_DOWN);
		    a1.sendKeys(Keys.ARROW_DOWN);
		    a1.sendKeys(Keys.ENTER).build().perform(); 
		   
		    Thread.sleep(3000); 
		    JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,600)", "");
            Thread.sleep(3000); 
		    //assign
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/button")).click();
		    Thread.sleep(2000);
		    }	
		@AfterTest
			public void tearDown()throws Exception{
          driver.quit();
		}
	}

