package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority=-5,invocationCount=2)
	public void test1()
	{
		System.out.println("HI test1");
	}
	
	@Test(priority=3,enabled=true)
	public void test2()
	{
		System.out.println("HI test2");
	}
	@Test(priority=-6,enabled=false)
	public void test3()
	{
		System.out.println("HI test3");
	}

}
