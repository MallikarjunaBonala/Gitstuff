import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoFirefox {

	public static void main(String[] args) {
		//invoking the browser
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.google.com");
     System.out.println(driver.getTitle());     
	}

}
