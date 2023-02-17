package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Script extends Generic_Browser 
{
	@Test
	public void Demo1()
	{
		System.out.println("Pipeline deployment is done working fine");
	}
	@Test
	public void Demo2()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void Demo3()
	{
		Assert.assertTrue(true);
	}
}
