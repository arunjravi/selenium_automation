package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnerzclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc executed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed to executed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc got skipped");
	}
	
	
	

}
