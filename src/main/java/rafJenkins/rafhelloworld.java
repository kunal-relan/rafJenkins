package rafJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rafhelloworld {
	
	private static String getHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}




	@Test
	public void testPrintHelloWorld() {
		System.out.println("Check if hello world matches");
		Assert.assertEquals(getHelloWorld(), "Hello World");

	}

}
