package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class parallel2 {
	@Test(groups = {"justfrfun"})
	public void test5() throws FileNotFoundException, IOException
	{
		Properties p2 = new Properties();
		p2.load(new FileInputStream("./p.properties"));
		String val2 = p2.getProperty("java");
		System.out.println(val2);
	}

}
