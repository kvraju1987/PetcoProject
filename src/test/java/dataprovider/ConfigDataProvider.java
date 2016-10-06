package dataprovider;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider 
{

	Properties pro;
	public ConfigDataProvider()
	{
	File src = new File("./Configuration/config.properties");
	
	try
	{
		FileInputStream fis = new FileInputStream(src);
		
	    pro = new Properties();
		
		pro.load(fis);
		
	} catch (Exception e)
	{
		
		System.out.println("exception" + e.getMessage());
	}
	}
	
	public String getChromePath()
	{
		String url = pro.getProperty("chromepath");
		return url;
	}
	
	public String getIePath()
	{
		String url = pro.getProperty("iepath");
		return url;
	}
	
	public String getUrl()
	{
		String url = pro.getProperty("url");
		return url;
	}
}
