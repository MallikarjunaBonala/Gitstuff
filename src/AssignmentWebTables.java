import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://qaclickacademy.com/practice.php");
	    WebElement count=driver.findElement(By.id("product"));
	    int noOfRows=count.findElements(By.xpath("//tbody/tr")).size()-1;
	    System.out.println(noOfRows);
	    int noOfColumns=driver.findElements(By.xpath("//tbody/tr[3]/td")).size();
	    System.out.println(noOfColumns);
	    for(int i=0;i<noOfColumns;i++) {
	    	System.out.println(driver.findElements(By.xpath("//tbody/tr[3]/td")).get(i).getText());
	    }
	}

}
