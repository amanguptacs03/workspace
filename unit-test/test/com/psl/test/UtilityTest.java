package com.psl.test;



import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.until.Utility;

public class UtilityTest {

	private Utility utility;
	
	
	@BeforeClass
	public static void setUpForTestClass(){
		
		
	}
	
	
	@AfterClass
	public static void cleanUpAfterTestClass(){
		
	}
	
	@Before
	public void setUpForTestMethod(){
	 utility=new Utility();
	}
	
	@After
	public void cleanUpAfterTestMethod(){
		
	}
	
	@Test(expected=SQLException.class)
	public void testFactorial_1() {
		int number=3;
		long expectedResult=6,actualResult;
		
		
		actualResult=utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testFactorial_2() {
		int number=5;
		long expectedResult=120,actualResult;
		
	
		actualResult=utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testFactorial_3() {
		int number=7;
		long expectedResult=5040,actualResult;
		
	
		actualResult=utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testFactorial_4() {
		int number=0;
		long expectedResult=1,actualResult;
		
		actualResult=utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
