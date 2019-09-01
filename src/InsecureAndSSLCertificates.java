import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InsecureAndSSLCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions ch=new ChromeOptions();
		ch.merge(dc);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(ch);   
	}
}
