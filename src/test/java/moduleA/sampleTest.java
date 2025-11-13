package moduleA;

import org.testng.annotations.Test;

public class sampleTest {
	@Test(groups = "RT")
	public void demoTest()
	{
		System.out.println("done");
		System.out.println("all done");
		System.out.println("ok");
		System.out.println("all done");
		System.out.println("done");
		System.out.println("done");
	}
	
	@Test
	public void growTest()
	{
		System.out.println("done");
	}

}
