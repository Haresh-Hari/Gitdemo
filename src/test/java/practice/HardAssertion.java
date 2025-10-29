package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void stringLevelHardAssertion() {
		String Actiualname="Hari";
		String Expectedname="Hari";
		Assert.assertEquals(Actiualname,Expectedname);
		Assert.assertTrue(Actiualname.equals(Expectedname));
		
	}
	@Test
	public void ContainsLevelHardAssertion() {
		String Actiualname="Qspiders";
		String Expectedname="spiders";
		//Assert.assertEquals(Actiualname,Expectedname);
		Assert.assertTrue(Actiualname.contains(Expectedname));
		
	}
}
