import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTutorial {
  @Test
  public void test()
  {
	 System.out.println("Test"); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	 System.out.println("BeforeMethod"); 
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("AfterMethod");
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("BeforeSuite");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("AfterClass");
  }
  @BeforeClass
  public void beforeClass()
  {
	 System.out.println("BeforeClass"); 
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("AfterSuite");
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("AfterTest");
  }
}
