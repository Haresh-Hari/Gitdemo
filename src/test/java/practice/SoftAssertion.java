package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class SoftAssertion { 

	public void stringLevel() {
		String Actual="Rama";
		String Expected="Ram";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actual, Expected,"not matching names");
		
		sa.assertAll();
	}
	@Test
	public void containsLevel() {
		String Actual="Rama";
		String Expected="Ram";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actual.contains(Expected), true);
		System.out.println("Assartion completed");
		
		sa.assertAll();
		
	}

}
