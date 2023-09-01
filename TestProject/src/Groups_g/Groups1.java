package Groups_g;

import org.testng.annotations.Test;
@Test(groups = {"release1"})
public class Groups1 {
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("compose");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("sentitems");
	}
	
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("draft");
		//thread.slee();
	}

}
