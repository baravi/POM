package testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Listeners1 implements IAnnotationTransformer,IRetryAnalyzer {


	int maxTry =1;
	@Override
	public boolean retry(ITestResult result) { //To run only once, created this if statement
		if(!result.isSuccess() && maxTry <2)
		{
			maxTry++;
			return true; //If true -  it will execute the method retry
		}
		return false; // if false, it will not initiate the method retry
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		//To run all the  classes only once which is mentioned in the .xml file we are using annotation.setInvocationcount(1)
		annotation.setInvocationCount(1);
		if(!testMethod.getName().equalsIgnoreCase("CreateLead")) {
			annotation.setEnabled(false);
		}
		annotation.setRetryAnalyzer(this.getClass()); // to initiate the retry method
		
		
	}

}
