package testcase;

import org.testng.annotations.Test;

import wdMethods.Annotation;

public class MergeLead extends Annotation {

	@Test(groups= {"regression"})
	public void mergeLead() {
		System.out.println("merge success");
		
	}
}
