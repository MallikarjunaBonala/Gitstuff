import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.path2usa.com/travel-companions");
	    driver.findElement(By.id("travel_date")).click();
	    WebElement mY=driver.findElement(By.className("datepicker-switch"));
	    while(!mY.getText().contains("Nov"))
	    	{
	    	   driver.findElement(By.className("next")).click();
	    	}
	    int count=driver.findElements(By.className("day")).size();
	    for(int i=0;i<count;i++) {
	    	String dayText=driver.findElements(By.className("day")).get(i).getText();
	    	if(dayText.equalsIgnoreCase("20")) {
	    		driver.findElements(By.className("day")).get(i).click();
	    	}
	    }
	}
}
