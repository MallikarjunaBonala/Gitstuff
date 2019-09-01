import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://ksrtc.in/oprs-web/guest/home.do");
	    driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script="return document.getElementById(\"fromPlaceName\").value";
        String text=(String)js.executeScript(script);
        int i=0;
        while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
        	i++;
        	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
        	text=(String)js.executeScript(script);
        	if(i>10) {
        		break;
        	}
        }   
        System.out.println("success" + text);
	}
}
