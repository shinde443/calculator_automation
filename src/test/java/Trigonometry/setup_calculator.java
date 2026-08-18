package Trigonometry;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setup_calculator {
	ChromeDriver driver;
//	setup_calculator sc=new setup_calculator();
//	sc.lounch();
	
	
	@Test
	void lounch() throws InterruptedException
	{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	
//	driver=new ChromeDriver();
	sin_testcase s=new sin_testcase();
	s.sin30();
	s.sin45();
	s.sin60();
	s.sin90();
	s.sinpi();
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	}

}
