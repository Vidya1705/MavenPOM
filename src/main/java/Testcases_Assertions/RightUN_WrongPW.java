package Testcases_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightUN_WrongPW 
{
	@Test
	   public void testcase()
	   {
		   ChromeDriver driver= new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   WebElement UN=driver.findElement(By.name("email"));
		   UN.sendKeys("vidya1985@gmail.com");
		   WebElement PW=driver.findElement(By.name("pass"));
		   PW.sendKeys("vids123");
		   WebElement login=driver.findElement(By.name("login"));
		   login.click();
		   Assert.assertEquals(true, false);//TC is fail
	   }
}
