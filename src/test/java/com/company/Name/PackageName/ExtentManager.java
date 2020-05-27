package com.company.Name.PackageName;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentManager {
	
	
	 public static ExtentReports extent;
	 private static String reportFileName = "Test-Automaton-Report" + ".html";
	 private static String fileSeperator = "\\";
	 private static String reportFilepath = System.getProperty("user.dir") + fileSeperator + "TestReport";
	 private static String reportFileLocation = reportFilepath + fileSeperator + reportFileName;
	 
	 public static ExtentReports getInstance() {
		    if (extent == null) {
		      createInstance();
		    }
		    return extent;
		  }
	 
	public static ExtentReports createInstance() {
		// TODO Auto-generated method stub
		 final String fileName = getReportPath(reportFilepath);
		 final ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		 htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		    htmlReporter.config().setChartVisibilityOnOpen(true);
		    htmlReporter.config().setTheme(Theme.STANDARD);
		    htmlReporter.config().setDocumentTitle(fileName);
		    htmlReporter.config().setCSS("css-string");
		    htmlReporter.config().setJS("js-string");
		    htmlReporter.config().setDocumentTitle(reportFileName);
		    htmlReporter.config().setEncoding("utf-8");
		    htmlReporter.config().setReportName(reportFileName);
		    htmlReporter.config().setTheme(Theme.STANDARD);
		    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		    
		    extent=new ExtentReports();
		    extent.attachReporter(htmlReporter);
		 // Set environment details
		    extent.setSystemInfo("OS", "Windows");
		    extent.setSystemInfo("AUT", "Qa");
			return extent;
	}

	//create folder mkdir
	public static String getReportPath(String path) {
		// TODO Auto-generated method stub
		 final File testDirectory = new File(path);
		    if (!testDirectory.exists()) {
		      if (testDirectory.mkdir()) {
		        System.out.println("Directory: " + path + " is created!");
		        return reportFileLocation;
		      } else {
		        System.out.println("Failed to create directory: " + path);
		        return System.getProperty("user.dir");
		      }
		    } else {
		      System.out.println("Directory already exists: " + path);
		    }
		    return reportFileLocation;
		  }

}
