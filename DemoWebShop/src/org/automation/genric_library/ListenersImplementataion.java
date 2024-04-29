package org.automation.genric_library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersImplementataion implements ITestListener {
	public void onTestFailure(ITestResult result) {

		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshot/"+result.getName()+".png");
		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}}}
