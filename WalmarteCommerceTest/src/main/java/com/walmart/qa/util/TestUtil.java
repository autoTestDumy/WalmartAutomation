package com.walmart.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.walmart.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long Page_Load_timeout = 20;
	public static long Implicit_Wait = 10;

	
	public static void takeScreenShot(String fileName) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\samir\\eclipse-workspace\\WalmarteCommerceTest"+fileName+".jpg"));
		
	}

	
	
	
}



