import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInPageAndFooterPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://qaclickacademy.com/practice.php");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
	    WebElement footerLeftMenu=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(footerDriver.findElements(By.tagName("a")).size()); 
	    System.out.println(footerLeftMenu.findElements(By.tagName("a")).size());
	    for(int i=0;i<footerLeftMenu.findElements(By.tagName("a")).size();i++)
	    {
	    	String openingLinksInNewTabOrWindow=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	footerLeftMenu.findElements(By.tagName("a")).get(i).sendKeys(openingLinksInNewTabOrWindow);
	    }
	    Set<String> windows=driver.getWindowHandles();
	    Iterator<String> itr=windows.iterator();
	    while(itr.hasNext()) {
	    	driver.switchTo().window(itr.next());
	    	System.out.println(driver.getTitle());
	    }
	}
}
