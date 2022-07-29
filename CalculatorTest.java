package com.Project.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;




import static org.junit.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class CalculatorTest {
	Calculator calc1;
	
  /*@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }*/

  @DataProvider(name="add")
  public Object[][] dpadd() {
    return new Object[][] {
      new Object[] { 1, 2, 3 },
      new Object[] { 2, -4, -2 },
      new Object[] { 2, 0, 2 },
      new Object[] { -1, 0, -1 },
    };
  } 
  @DataProvider
  public Object[][] dpsub() {
    return new Object[][] {
      new Object[] { 1, 2, -1 },
      new Object[] { 2, -4, 6 },
      new Object[] { 2, 0, 2 },
      new Object[] { -1, 0, -1 },
    };
  } 
   @DataProvider
  public Object[][] dpmul() {
    return new Object[][] {
      new Object[] { 1, 2, 2 },
      new Object[] { 2, -4, -8 },
      new Object[] { 2, 0, 0 },
      new Object[] { -1, 0, -0 },
    };
  } 
  @DataProvider
  public Object[][] dpdiv() {
    return new Object[][] {
      new Object[] { 4, 2, 2 },
      new Object[] { 100, -2, -50 },
      new Object[] { -150, 3, -50 },
      new Object[] { 46, 2, 23 },
    };
  } 
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
	   calc1 = new Calculator();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }
  
  @Test(dataProvider="add")
	public void add(int a, int b, int total) {
		System.out.println("Add");
		//fail("Not yet implemented")
		
		int res = calc1.add(a, b);
		assertEquals(total,res);
	}
	
	@Test(dataProvider="dpsub")
	public void subtract(int a, int b, int total) {
		System.out.println("Subtract");
		//fail("Not yet implemented")
		
		int res = calc1.subract(a, b);
		assertEquals(total,res);
	}
	@Test(dataProvider="dpmul")
	public void multiply(int a, int b, int total) {
		System.out.println("Multiply");
		//fail("Not yet implemented")
		
		int res = calc1.multiply(a, b);
		assertEquals(total,res);
	}
	@Test(dataProvider="dpdiv")
	public void divide(int a, int b, int total) {
		System.out.println("Divide");
		//fail("Not yet implemented")
		
		int res = calc1.divide(a, b);
		assertEquals(total,res);
	}
}
