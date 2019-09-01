import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://qaclickacademy.com/practice.php");
	    WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
	    checkbox1.click();
	    String checkboxLabel=checkbox1.getAttribute("value");
	    System.out.println(checkboxLabel);
	    Select s= new Select(driver.findElement(By.id("dropdown-class-example")));
	    s.selectByValue(checkboxLabel);
	    driver.findElement(By.id("name")).sendKeys(checkboxLabel);
	    String textboxText=driver.findElement(By.id("name")).getText();   
	    driver.findElement(By.id("alertbtn")).click();
	    String popUptext=driver.switchTo().alert().getText();
	    if(popUptext.contains(textboxText)) {
	    	System.out.println("Successfull");
	    }    
	    else {
	    	System.out.println("Something Wrong");
	    }
	}
}
