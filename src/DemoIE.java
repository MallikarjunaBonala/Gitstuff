import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE {

	public static void main(String[] args) {
		//invoking the browser
     System.setProperty("webdriver.ie.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\msedgedriver.exe");
     WebDriver driver=new InternetExplorerDriver();
     driver.get("https://www.google.com");
     System.out.println(driver.getTitle());     
	}

}
