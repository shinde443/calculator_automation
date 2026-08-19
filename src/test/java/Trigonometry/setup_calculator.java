package Trigonometry;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class setup_calculator  {
	ChromeDriver driver;

	
	
	@BeforeSuite
	void lounch() throws InterruptedException
	{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	

	
//	 sin_testcase s=new  sin_testcase();
//	 s.sin30();
//	 s.sin45();
	
	}

}
