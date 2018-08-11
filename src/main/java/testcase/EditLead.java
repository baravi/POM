package testcase;

import org.testng.annotations.Test;

import wdMethods.Annotation;

public class EditLead extends Annotation {

	@Test(groups = {"smoke"})
	public void editLead() {
		System.out.println("Edit lead is successfull");

	}

}
