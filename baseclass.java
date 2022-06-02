package Resources;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class baseclass {
	public WebDriver driver;
	public WebDriver intializeDriver() throws IOException {

	FileInputStream fis = new FileInputStream("C:\\Users\\91942\\eclipse-workspace\\loginproject\\src\\main\\java\\Resources\\data.properties");
	Properties prop = new Properties();
	prop.load(fis);
//	String browserName = prop.getProperty("browser");


	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91942\\OneDrive\\Desktop\\selenium jas\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
	//	C:\Program Files\Google\Chrome\Application\chrome.exe
		
		driver = new ChromeDriver();	
	

	}
	return driver;
	}

	@BeforeMethod
	public void launchBrowser() throws IOException {
	driver=intializeDriver();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	}

}
