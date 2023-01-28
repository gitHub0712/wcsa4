package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	
	 @Test(groups= "fuctional")
	 
	
  
  public void ft1() {
	  
	   Reporter.log("fuctional Testing",true);
  }
  
  
  @Test(groups= "integration")
  public void ft2() {
	  
	   Reporter.log("integration Testing",true);
  }
  
  
  
  @Test(groups= "System")
  public void ft3() {
	  
	   Reporter.log("System  Testing",true);
  }
  
  
  
  @Test(groups= "acceptance ")
  public void ft4() {
	  
	   Reporter.log("acceptance Testing",true);
	   
  }
  
  
  
  
  
  
		  
	   
		
		  
  
}
