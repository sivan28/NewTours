package automation.selenium.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import automation.selenium.utilities.ExcelReader;


public class Page extends ExcelReader{

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
			
	@BeforeClass
	public void setUp() throws IOException {

		fis = new FileInputStream(
				"C:\\Users\\Siva\\eclipse-workspace\\NewTours\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		log.debug("config file loaded!");
		
		fis = new FileInputStream("C:\\Users\\Siva\\eclipse-workspace\\NewTours\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.debug("OR file loaded!");

		if (config.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Siva\\eclipse-workspace\\NewTours\\src\\test\\resources\\executables\\chromedriver.exe");

			driver = new ChromeDriver();
			log.debug("chrome launched!");
		} else if (config.getProperty("browser").equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Siva\\eclipse-workspace\\NewTours\\src\\test\\resources\\executables\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.get(config.getProperty("baseURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {

		if (driver!= null) {
			driver.quit();
		}
	}
	
	@DataProvider(name ="testData")
	public static Object[][] getTestData() throws IOException {
	   Object[][] data = ExcelReader.getDataFromExcel();
	   return data;
	}
}
