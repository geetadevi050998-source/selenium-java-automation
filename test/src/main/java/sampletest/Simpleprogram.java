package sampletest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simpleprogram {

	@BeforeMethod
	
	public void setup() {
        System.out.println("Before each test - setup executed.");
    }
	
	@Test
	
	 public void testExample() {
        System.out.println("Test method executed.");
    }
}

