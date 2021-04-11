package testNG.concept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;


public class TestNGAssertions {

	// Assertions are used to validate expected result against actual result.
	// TestNG provides two types of Assertions.
	// Hard Assertions: if Expected is not equal to actual, execution will stop at
	// this point.
	// Soft Assertions: if expected is not equal to actual,execution will continue
	// but test case will fail

	// Syntax for hard Assertion is : Assert.MethodName(Actual, Expected)
	// SoftAssertion class is provided by TestNG. we need to create Obj of
	// SoftAssertion class
	// Then we can use methods provided by SoftAssertion class. at the end of
	// assertion we need to
	// call assertAll method to confirm assertions, otherwise it will not provide
	// test status.

	@Test (enabled = true) // enabled = flase will ignore the test case from execution 
	public void hardAssertion() {

		int actualValue = 4;
		int expectedValue = 4;

		AssertJUnit.assertEquals(actualValue, expectedValue);
		System.out.println("This line of code will be executed if assertion passed");

	}
	@Test
	public void softAssertion() {

		int a = 10;
		int b = 10;

		SoftAssert softAssert = new SoftAssert();
		AssertJUnit.assertEquals(a, b);
		System.out.println("this line of code will be executed regardless of assertion pass or fail");
		AssertJUnit.assertTrue(true);
		System.out.println("This is after second execution");

		softAssert.assertAll();

	}

	
	
	
	
	
	

}
