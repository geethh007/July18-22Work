package example.test.tdd;

import org.junit.Assert;
import org.junit.Test;

public class addTwoNumbers {

	private Calculator myCalculator = new Calculator();

	@Test
	public void addTwoPositiveNumbers()
	{
		int expectedResult = 30;
		int ActuaResult = myCalculator.Add(10, 20);
		System.out.println(ActuaResult);
		Assert.assertEquals("The the sum of two positive numbers is correct" , expectedResult, ActuaResult);	
	}

	@Test
	public void addTwoNegativeNumbers()
	{
		int expectedResult = -30;
		int ActuaResult = myCalculator.Add(-10, -20);
		System.out.println(ActuaResult);
		Assert.assertEquals("The the sum of two negative numbers is correct" , expectedResult, ActuaResult);	
	}	
}