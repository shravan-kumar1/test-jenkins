package sampletestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
	@Test
	public void verifyloginwithValidCredentials() {
		
		System.out.println("Test starting...");
		System.out.println("verifyloginwithValidCredentials");
		Assert.assertTrue(true);
		System.out.println("Test Ended....");
	}
	
	@Test
     public void verifyloginwithInValidCredentials() {
		
		 System.out.println("Test starting...");
		 System.out.println("verifyloginwithInValidCredentials");
		 Assert.assertTrue(false);
		 System.out.println("Test Ended....");
	}
	
      @Test
      public void verifyloginwithNoValidCredentials() {
	
	      System.out.println("Test starting...");
	      System.out.println("verifyloginwithNoCredentials");
	      Assert.assertTrue(true);
	      System.out.println("Test Ended....");
}

}
