import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    //WebDriver driver = new ChromeDriver(options);
	    WebDriver driver=new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait example
	    driver.get("https://www.cleartrip.com");
	    //Thread.sleep(10000L);
	    //driver.switchTo().alert().getText();
	    Select s=new Select(driver.findElement(By.id("Adults")));
	    s.selectByIndex(4);
	    int totalDropdownElementsofAdults=driver.findElements(By.id("Adults")).size();
	    System.out.println(totalDropdownElementsofAdults);
	    WebDriverWait d=new WebDriverWait(driver,15);
	    d.until(ExpectedConditions.elementToBeClickable(By.id("Adults")));
	    for(int i=0;i<totalDropdownElementsofAdults-3;i++) {
	    	s.selectByIndex(i); 	
	    }
	    driver.findElement(By.cssSelector(".span.span15.datePicker")).click();
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
	    driver.findElement(By.id("SearchBtn")).click();
	    String errorMessage=driver.findElement(By.id("homeErrorMessage")).getText();
	    System.out.println(errorMessage);
	}
}
