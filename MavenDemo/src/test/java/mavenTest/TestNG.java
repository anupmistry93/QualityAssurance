package mavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
	
	
  @Test
  public void test() {
	  
	  int a=20;
	  int b=10;
	  Assert.assertEquals(30,a+b);
	  
	  System.out.print("result: SUM"+ "\n");
  }
  
  @Test
  public void test1() {
	  
	  int a=20;
	  int b=10;
	  Assert.assertEquals(10,a-b);
	  
	  System.out.print("result: SUB"+ "\n");
  }
}
