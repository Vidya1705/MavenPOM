package testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserParallelpractice 
{
  WebDriver driver;
  @Test
  @Parameters("browser")
  public void testcase(String nameofbrowser)
  {
	  if(nameofbrowser.equals("chrome"))
	  {
		  driver= new ChromeDriver();
	  }
	  if(nameofbrowser.equals("edge"))
	  {
		  driver= new EdgeDriver();
	  }
	  if(nameofbrowser.equals("firefox"))
	  {
		  driver= new FirefoxDriver();
	  }
	  driver.get("https://www.codewithmosh.com");
	  driver.manage().window().maximize();
	  
  }
}
