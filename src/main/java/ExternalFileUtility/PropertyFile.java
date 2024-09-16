package ExternalFileUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class PropertyFile 
{
	@Test
	public static String propertiesRead(String key) throws IOException
	{
		File path = new File("C:\\Users\\hp\\automation_testing\\com.crm.pric\\Data Files\\PTData.properties");
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String data = prop.getProperty(key);
		
		return data;
		
	}
}
