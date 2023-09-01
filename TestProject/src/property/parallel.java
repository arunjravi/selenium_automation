package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class parallel {
	@Test
	public void test() throws FileNotFoundException, IOException
	{
		//step1
		Properties p = new Properties();
		
		//step2
		p.load(new FileInputStream("./p.properties"));
		
		//step3
		String val = p.getProperty("baseurl");
		System.out.println(val);
	}

}
