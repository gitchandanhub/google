import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumEncodeDecode 
{
WebDriver driver;

@BeforeTest
public void g() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Complete selenium\\ChromeDriver\\79latest\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("http://www.way2testing.com/p/this-webpage-is-designed-for-selenium.html");
    Thread.sleep(2000);
}
@Test
public void Firstname()
{
	WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
	fname.clear();
	String xyz = "d2F5MnRlc3Rpbmc=";
	String input2 = EncodeDecode.Decode(xyz);
	fname.sendKeys(input2);
}
}
