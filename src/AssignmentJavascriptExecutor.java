import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentJavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://qaclickacademy.com/practice.php");
	    driver.findElement(By.id("autocomplete")).sendKeys("uni");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    String script="return document.getElementById(\"autocomplete\").value";
	    String text=(String) js.executeScript(script);
	    int i=0;
	    while(!text.equalsIgnoreCase("United States"))
	    { 
	      i++;
	      driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	      text=(String)js.executeScript(script);
	      if(i>10) {
	    	  break;
	      }
	    }
	    System.out.println(text);
	}

}
