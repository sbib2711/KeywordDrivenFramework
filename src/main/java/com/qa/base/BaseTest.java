package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

	public Properties prop;
	public WebDriver driver = null;

	public WebDriver init_driver(String browserName){

		if (driver == null){

			if (browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:/GETAutomationPOMTest/KeywordDriven/browserdriver/chromedriver.exe");
				if (prop.getProperty("headless").equals("yes")){
					ChromeOptions opt = new ChromeOptions();
					opt.addArguments("window-size=1400,800");
					opt.addArguments("--headless");
					driver = new ChromeDriver(opt);
				}else{
					driver = new ChromeDriver();
				}
			}

		}
		
		return driver;
	}
	
	public Properties init_properties(){
		
		try{

			File filename=new File("D:/GETAutomationPOMTest/KeywordDriven/src/main/java"
					+ "/com/test/config/config.properties");;
			prop = new Properties();
			FileInputStream ip = new FileInputStream(filename);
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
}
