package testNgclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Basic {
	
	@BeforeClass
	public void xyz() {
		System.out.println("before class");
	}
	@BeforeTest
	public void xyz1() {
		System.out.println("Before test");
	}
	@BeforeMethod
	public void xyz2() {
		System.out.println("Before Method");
	}
	@Test
	public void test() {
		System.out.println();
	}
	@AfterMethod
	public void abc() {
		System.out.println("After method");
	}
	@AfterTest
	public void abc1() {
		System.out.println("After test");
	}
	@AfterClass
	public void abc2() {
		System.out.println("After class");
	}

		
}
