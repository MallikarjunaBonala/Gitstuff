import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    //driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	    driver.switchTo().frame(0);
	    Actions action=new Actions(driver);
	    action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	    driver.switchTo().defaultContent();
	    driver.close();
	}
}
