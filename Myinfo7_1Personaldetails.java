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
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Myinfo7_1Personaldetails{

		public static WebDriver driver;
		public static String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		@BeforeMethod
		public void driverSetUp()throws  IOException{
		
		//	System.setProperty("webdriver.gecko.driver","C:\\Users\\sneha_demanna\\Downloads\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");    	
			//driver = new FirefoxDriver(); 
			System.setProperty("webdriver.edge.driver","D:\\sele\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		
	  @Test
	  public void f() throws InterruptedException
	  {
		  Actions act=new Actions(driver);
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		   driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(1000);
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		    Thread.sleep(1000); 
		    
		  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		  Thread.sleep(1000); 
		  
		  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a")).click();
		  Thread.sleep(1000);
		  
		  //employee_name
		  WebElement a=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
		  act.doubleClick(a).perform();
		  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).clear();
		  //Thread.sleep(1000);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Sam");
		 //MIDDLE NAME
		  WebElement b= driver.findElement(By.name("middleName"));
		  act.doubleClick(b).perform();
		  Thread.sleep(1000); 
	
		  driver.findElement(By.name("middleName")).sendKeys("joseph"); 
		  //LAST NAME
		  WebElement c=driver.findElement(By.name("lastName"));
		  act.doubleClick(c).perform();
		  Thread.sleep(1000);
		  driver.findElement(By.name("lastName")).sendKeys("Kene"); 
		  Thread.sleep(1000); 
		  //NICKNAME
		  WebElement d=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));
		  act.doubleClick(d).perform();
		 driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")).sendKeys("Vicky");
		  Thread.sleep(1000);
		  //EMPLOYEE ID
		  WebElement e=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		  act.doubleClick(e).perform();
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("1234");
		  Thread.sleep(1000); 
		  //OTHER ID
		  WebElement f=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
		  act.doubleClick(f).perform(); 
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("123458");
		  Thread.sleep(1000); 
		  //LICENCE NUMBER
		  WebElement g=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
		  act.doubleClick(g).perform();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("987654");
		  Thread.sleep(1000);
		 //lincence expiry date
		  
	    //  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).click();
		//  WebElement q=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
		 // q.sendKeys(Keys.CONTROL,"A");
		  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2020-05-29");
	     //Thread.sleep(1000);
	   //SSN NUMBER 	  
		  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")).click();
		  Thread.sleep(1000);
		  
		  WebElement i=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"));
		   act.moveToElement(i);
		  act.doubleClick(i).perform(); 
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")).sendKeys("20001122");
		
		  //SIN NUMBER
		  WebElement j=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input"));
		  act.doubleClick(j).perform(); 
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input")).sendKeys("9049934874");
		  
		  //NATIONALITY
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i")).click();
		  Thread.sleep(1000);
		  Actions A=new Actions(driver);
		  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ENTER).build().perform();  
//MARITIAL STATUS
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")).click();
		  A.sendKeys(Keys.ARROW_DOWN); 
		//  A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ENTER).build().perform();  
		  
		//DATE OF BIRTH 
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).click();
		//  WebElement qr=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div"));
		  //qr.sendKeys(Keys.CONTROL,"A");
		 // driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div")).sendKeys("2020-07-16");
		  Thread.sleep(1000);
	   //military status
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label")).click();
		  Thread.sleep(1000);
		  WebElement ml=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input"));
		  act.doubleClick(ml).perform();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")).sendKeys("EWC");
		  WebElement l=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div"));
		  act.doubleClick(l).perform(); 
		  
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span/i")).click();
		  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div")).sendKeys("2022-10-28");*/
	       
		  //driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
		  
//custom field
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[2]/i")).click(); 
		 A.sendKeys(Keys.ARROW_DOWN);
		 A.sendKeys(Keys.ARROW_DOWN);
		  A.sendKeys(Keys.ENTER).build().perform();  
		  Thread.sleep(3000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click(); 
	  }


	  

	}










