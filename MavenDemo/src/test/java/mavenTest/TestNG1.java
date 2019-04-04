package mavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@Test
	  public void test3() {
		  
		  int a=2;
		  int b=1;
		  Assert.assertEquals(3,a+b);
		  
		  System.out.print("result: SUM1"+ "\n");
	  }
	  
	  @Test
	  public void test4() {
		  
		  int a=2;
		  int b=1;
		  Assert.assertEquals(1,a-b);
		  
		  System.out.print("result: SUB2"+ "\n");
	  }

}