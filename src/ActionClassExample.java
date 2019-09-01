import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    Actions action=new Actions(driver);
	    driver.get("https://www.amazon.com");
	    action.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();   
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("echo").doubleClick().build().perform();
	    action.moveToElement(driver.findElement(By.id("nav-orders"))).contextClick().build().perform();
	}
}
