import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
    int totalRadioButtons=driver.findElements(By.xpath("//input[@name='software']")).size();
    for(int i=0;i<totalRadioButtons;i++) {
    	String text=driver.findElements(By.xpath("//input[@name='software']")).get(i).getAttribute("value");
    	if(text.contentEquals("QuickBooks Pro")) {
    		driver.findElements(By.xpath("//input[@name='software']")).get(i).click();
    	}
    }
  driver.close();	
}
}