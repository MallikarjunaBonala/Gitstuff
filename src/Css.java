import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
	public static void main(String[] args) {
		 //invoking the browser
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://login.salesforce.com");
	     driver.findElement(By.cssSelector("*[class='input r4 wide mb16 mt8 username']")).sendKeys("mallikarjun");
	     driver.close();
}
}
