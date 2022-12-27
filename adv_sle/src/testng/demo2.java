package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo2 {
	@Test(invocationCount=3)
	public void test1()
	{
		Reporter.log("hello",true);
	}
	
	
	
	
	
	
	
	

}
