import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Number_practice
{
	WebDriver driver;
	@BeforeTest
	public void g() throws InterruptedException, IOException
	{
		Proxy p=new Proxy();
	    p.setHttpProxy("45.77.156.187:8080");
	    DesiredCapabilities cap=new DesiredCapabilities();     
	      // Pass proxy object p
	    cap.setCapability(CapabilityType.PROXY, p);
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Complete selenium\\ChromeDriver\\79latest\\chromedriver.exe");
	    driver = new ChromeDriver();
		//FirefoxOptions foptions = new FirefoxOptions();
	  // foptions.setCapability("marionette", false);
	   // driver = new FirefoxDriver(foptions);
	    driver.manage().window().maximize(); 
	    driver.navigate().to("https://www.google.com/search?tbm=lcl&sxsrf=ALeKk033wUccUq23xSU9vPuF_x30JDD90w%3A1585474957892&source=hp&ei=jW2AXrGKNOTWz7sP7oSHuAs&q=cardiology+in+delhi&oq=cardiology+in+delhi&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjoHCCMQ6gIQJzoFCAAQkQI6BQgAEIMBOgIIADoECAAQQzoGCAAQDRAeUIQgWKRHYIVKaAJwAHgAgAH8AogB7xiSAQcwLjkuMy4zmAEAoAEBqgEHZ3dzLXdperABCg&sclient=psy-ab&ved=0ahUKEwjxhKe9sr_oAhVk63MBHW7CAbcQ4dUDCAY&uact=5#rlfi=hd:;si:16600190340319617525,l,ChNjYXJkaW9sb2d5IGluIGRlbGhpWiEKCmNhcmRpb2xvZ3kiE2NhcmRpb2xvZ3kgaW4gZGVsaGk;mv:[[28.7125755,77.35191189999999],[28.501664899999998,77.1280811]]");
		Thread.sleep(30000);
	}
	@Test
	public void a() throws IOException, InterruptedException
	{
			
		List<WebElement> list = driver.findElements(By.cssSelector(".dbg0pd>div"));
	for(int i =0; i<list.size(); i++)
	{
		((JavascriptExecutor)driver).executeScript("scroll(10,400)");
		list.get(i).click();
		Thread.sleep(3000);
		
		try
		{
			String name = list.get(i).getText();
			System.out.println(name);
		}
		catch(Exception e2)
		{
			try
			{
				String name = driver.findElement(By.xpath(".//*[@id='akp_uid_2']/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[1]/div/span")).getText();
				System.out.println(name);
			}
			catch(Exception e3)
			{
				try
				{
					String name = driver.findElement(By.cssSelector(".FxvUNb.kno-ecr-pt.kno-fb-ctx.PPT5v.hNKfZe>span")).getText();
					System.out.println(name);
				}
				catch(Exception e8)
				{
					
				}
			}
		}
		try
		{
			String address = driver.findElement(By.xpath(".//*[@id='akp_uid_2']/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/span[2]")).getText();
			System.out.println(address);
		}
		catch(Exception e4)
		{
			try
			{
				String address = driver.findElement(By.cssSelector(".LrzXr")).getText();
				System.out.println(address);
			}
			catch(Exception e5)
			{
				
			}
		}
		try
		{
			String number = driver.findElement(By.xpath("//span[@class='zgWrF']")).getText();
			System.out.println(number);
			
		}
		catch(Exception e6)
		{
			try
			{
				String number = driver.findElement(By.cssSelector(".LrzXr.zdqRlf.kno-fv>span>span")).getText();
				System.out.println(number);
			}
			catch(Exception e7)
			{
				try
				{
				String number = driver.findElement(By.xpath(".//*[@id='akp_uid_2']/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[4]/div/div/span[2]/span/span")).getText();
				System.out.println(number);
				}
				catch(Exception e)
				{
					
				}
				}
		}
		try
		{
		String website = driver.findElement(By.xpath(".//*[@id='akp_uid_2']/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/a")).getAttribute("href");
		System.out.println(website);
		}
		catch(Exception e)
		{
			try
			{
			 String website = driver.findElement(By.cssSelector(".CL9Uqc.ab_button")).getAttribute("href");
				System.out.println(website);
			}
			catch(Exception e9)
			{
				
			}
		}
		
			
		
	}
	  
	list.clear();
	 k();
	}
public void k() throws InterruptedException, IOException
{
	try
	{
	driver.findElement(By.cssSelector("#pnnext>span")).click();
	   Thread.sleep(3000);
	  a();
	}
	catch(Exception e)
	{
		System.out.println("completed");
	}
}
	
}
