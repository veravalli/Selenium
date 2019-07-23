package RGC.RGCProject;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  Actions a=new Actions(driver);
	  driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();  
	new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlSignUpCountry']"))).selectByVisibleText("INDIA");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$uctlBusinessAddControl$txtPhone1")).sendKeys("8723634121");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$uctlBusinessAddControl$txtFName")).sendKeys("Auto");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$uctlBusinessAddControl$txtLName")).sendKeys("script");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$uctlBusinessAddControl$txtEmail")).sendKeys("auto@script1.com");
	
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$uctlBusinessAddControl$txtZip")).sendKeys("421204");
	
	//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_uctlBusinessAddControl_btnFind"))).click();
	
	//driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_uctlBusinessAddControl_btnFind'][@value='Find']")).click();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	driver.findElement(By.xpath("//input[@class='btn btn-theme' and @value='select'][@type='submit']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_uctlBusinessAddControl_txtAddress1']")).sendKeys("MindQ");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnProceed")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium softwares 2019\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://202.138.127.37/RGCPLUS_REVAMP/in/sign-up");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Thread.sleep(2000);
	  	  
  }

}
