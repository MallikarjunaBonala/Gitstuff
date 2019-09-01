import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	     driver.get("https://www.spicejet.com");
	     Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	     driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	     System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	     Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	     Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
	     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
	    	 Assert.assertTrue(true);
	     }else {
	    	 Assert.assertTrue(false);
	     }
	}

}
