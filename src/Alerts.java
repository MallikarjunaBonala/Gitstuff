import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		 //invoking the browser
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.switchTo().alert().accept();//OK,Done
	     driver.switchTo().alert().dismiss();//cancel
	     driver.switchTo().alert().getText();//to get the text of an alert box
	}
}
