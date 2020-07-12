package cross.listener;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import cross.base.TestBase;


public class CustomListeners extends TestBase implements ITestListener,ISuiteListener {

	public 	String messageBody;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {

		
	}

	public void onTestSkipped(ITestResult arg0) {


	}


	public void onTestStart(ITestResult arg0) {

	
	}

	public void onTestSuccess(ITestResult arg0) {


		
	}

	public void onFinish(ISuite arg0) {
		
		

		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

}
