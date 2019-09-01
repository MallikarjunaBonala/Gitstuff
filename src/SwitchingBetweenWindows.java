import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/");
	    driver.findElement(By.linkText("Multiple Windows")).click();
	    Set<String> wh=driver.getWindowHandles();
	    Iterator<String> itr=wh.iterator();
	    String parentWindow=itr.next();
	    String childWindow=itr.next();
	    driver.switchTo().window(childWindow);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.findElement(By.xpath("//*[contains(text(),'pen')]")).getText());
	    driver.switchTo().window(parentWindow);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.findElement(By.cssSelector("h1.heading")).getText());
	}

}
