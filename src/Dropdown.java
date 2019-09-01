import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("http://spicejet.com");
      Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
      s.selectByValue("USD");
      s.selectByIndex(2);
      s.selectByVisibleText("INR");
      driver.findElement(By.id("divpaxinfo")).click();
		/*
		 * for(int i=0;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click(); }
		 */
		/*
		 * int i=0; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
      driver.findElement(By.id("divpaxinfo")).getText();
      driver.findElement(By.id("btnclosepaxoption")).click();
      //Handling Dynamic Dropdown
      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("//*[text()=' Goa (GOI)']")).click();
      Thread.sleep(2000L);
      driver.findElement(By.xpath("(//*[text()=' Shirdi (SAG)'])[2]")).click();
      
      //Handling AutoSuggestive Dropdowns
      driver.get("https://www.makemytrip.com");
      WebElement source=driver.findElement(By.id("fromCity"));
      source.click();
      Thread.sleep(2000L);
      WebElement sourcetextbox=driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
      sourcetextbox.sendKeys("Hyd");
      sourcetextbox.sendKeys(Keys.ENTER);
      
      WebElement destination=driver.findElement(By.id("toCity"));
      destination.click();
      Thread.sleep(2000L);
      destination.sendKeys("Ban");
      destination.sendKeys(Keys.ARROW_DOWN.ENTER);
	}
}
