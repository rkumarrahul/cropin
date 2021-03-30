package pacgittest;

import org.testng.annotations.Test;

public class CreateProductTest {
	@Test(groups= {"regression"})
	public void createProduct()
	{
		String url=System.getProperty("URL");
		String user=System.getProperty("user");
		System.out.println("product cReate ");
		System.out.println(url);
		System.out.println(user);
	}
	
}
