package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.timeUtils;

public class BaseAmazonClass {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseAmazonClass() {
		try {
			FileInputStream file= new FileInputStream("C:\\Users\\bansa\\eclipse-workspace\\AmazonFramework\\src\\test\\java\\environmentVariable\\Config.properties");
			prop.load(file);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
	
	public static void initiation() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeUtils.time));
		driver.get(prop.getProperty("url"));
	}
	
	public static String username() {
		String userName=prop.getProperty("username");
		return userName;
	}
	public static String defaultPassword() {
		String password=prop.getProperty("password");
		return password;
	}
	
}
