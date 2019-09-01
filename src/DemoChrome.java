import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoChrome {

	public static void main(String[] args) {
	 //invoking the browser
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com");
     //driver.findElement(By.xpath("//div[@class='gb_f gb_g']a[1]")).click();//parent-child relation xpath
     //driver.findElement(By.xpath("//input[@class='RNmpXc']/preceding::input[1]")).click();
     driver.findElement(By.xpath("//*[text()='Advertising']")).click();
     System.out.println(driver.getTitle()); 
     System.out.println(driver.getCurrentUrl());
     //System.out.println(driver.getPageSource());
     driver.get("https://login.salesforce.com");
     driver.findElement(By.id("username")).sendKeys("mallik");
     driver.findElement(By.id("password")).sendKeys("bonala");
     driver.findElement(By.id("Login")).click();
     System.out.println(driver.findElement(By.cssSelector("#error")).getText());
     driver.get("https://www.facebook.com");
     driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mallikarjuna.bonala@gmail.com");
     driver.findElement(By.cssSelector("#pass")).sendKeys("Malli@123");
     driver.findElement(By.xpath("//input[@value='Log In']")).click();//customized xpath
     driver.get("https://www.rediff.com");
     driver.findElement(By.cssSelector("a[title*='Watch']")).click();
     driver.findElement(By.cssSelector("input#srchword")).sendKeys("rain");
     driver.findElement(By.xpath("//input[contains(@title,'Sea')]")).click();
     System.out.println("success");
     
     //driver.navigate().back();
     //driver.navigate().forward();
     driver.close();//closes current browser window.
     //driver.quit();//closes all the browser windows.
	}
}
