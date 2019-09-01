import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TablesGrid {
	public static void main(String[] args) {
	    int sum=0;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mallikarjuna B\\Desktop\\Udemy-Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22853/wi-vs-ind-1st-t20i-india-tour-of-west-indies-2019");
	    WebElement innings=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    int rowCount=innings.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	    System.out.println(rowCount);
	    int count=innings.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	    System.out.println(count);
	    for(int i=0;i<count-2;i++) {
	    	String s=innings.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	    	int individualScore=Integer.parseInt(s);
	    	sum=sum+individualScore;
	    }
	    String s2=innings.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	    int extras=Integer.parseInt(s2);
	    int totalSum=sum+extras;
	    System.out.println(totalSum);
	    String s3=innings.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	    int totalScore=Integer.parseInt(s3);
	    System.out.println(totalScore);  
	    Assert.assertEquals(totalSum,totalScore);
	}
}
