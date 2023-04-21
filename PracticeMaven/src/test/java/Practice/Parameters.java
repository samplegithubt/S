package Practice;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

public class Parameters {
	
	@Test
	public void m1()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
	}

}
