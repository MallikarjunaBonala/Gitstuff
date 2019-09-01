import org.testng.TestNG;

public class Samples {

	public static void main(String[] args) throws ClassNotFoundException {
        TestNG test = new TestNG();
        test.setTestClasses(new Class[] { TestNGTutorial.class });
        test.run();
		// TODO Auto-generated method stub

	}

}
