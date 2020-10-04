package windowControlWithSelenium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String downloadPath=System.getProperty("user.dir"); //here the file will be download dynamically . We will get this path (E:\Eclipse\JavaPractice) which is our project path by this code. This is machine independent wherever we are working
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe"); //driver.chrome.driver is a property in which we are storing this value "D:\\work\\chromedriver.exe"
		//chromedriver is a class which is implementing webdriver interface. 
		
		//here is 3 lines of code to set defaultdirectory path
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); //firstly create one hashmap chromePref object
		chromePrefs.put("profile.default_content_settings.popups", 0); //this is the another property in chrome which is set to be "0".
	    chromePrefs.put("download.default_directory", downloadPath);  //"download.default_directory" this is one key or property in chrome, in that we have to tell what is our default property. So I used downloadPath
	    //here "chromePrefs" knows that where to download the file so passed this to setexperimental method as argument
		
		ChromeOptions options=new ChromeOptions();
		//it is a class used to set all preferences required before u invoke ur chrome browser
		options.setExperimentalOption("prefs", chromePrefs); //similarly chrome also knows now this property bcoz setExperimental is a method in which we set the preferences
		
		WebDriver driver=new ChromeDriver(options); // we set thos options object as an argument so that when the chrome browser is invoked it will read the preference exist in options object
		driver.manage().window().maximize();			
		driver.get("https://altoconvertpdftojpg.com/");		
		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();  //here we use regular expression in css selector
		Thread.sleep(8000); //bcoz .exe file may take 2 or 3 seconds to get invoke
		Runtime.getRuntime().exec("E:\\Shera I card\\FileUpload.exe"); //selenium do not have any knowledge of calling .exe file located 
		//in your system but java does this for us as we are writing java with selenium. So Runtime is a java class 
		//of calling .exe file at runtime. And exec is a method of runtime static class which helps us to execute.
		//we know that "convert now" will take some time to load the file, so I will use explicit wait
		

	
		WebDriverWait wait=new WebDriverWait(driver, 40);  				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));				
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("window.scroll(0,document.body.scrollHeight)");		
		driver.findElement(By.cssSelector("button[class*='medium']")).click();// again using customize cssselector				
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click();
	
		
		
	
		//Java Script executor is an interface of Selenium WebDriver that has the functionality similar to 
		//that of Java Script and can interact with HTML DOM elements. Instead of using driver.findElement 
		//method of the Selenium WebDriver we can use JavaScriptExecutor Interface to perform similar action 
		//on the Page.
	
		
		
		
		Thread.sleep(5000); //downloading a file will take sometime. Here we cant use explicit wait bcoz we want to se whether file is downloaded or not
		//and this is a (File f=new File(downloadPath+"/Converted.jpg")) desktop things for which we cant use explicit wait bcoz selenium work only for web parts things
		
		//after downloading how can we sure that the file is actually stored in our system. One thing is sure 
		//that if the file is downloaded will be in download folder. So we will copy the download folder location and follow the next step
		
//		File f=new File("C:\\Users\\MUKUL S ANAND\\Downloads\\Converted.jpg"); // file is a class in java in which we are sending an argument
		// to this file class and we have a method called f.exists which will tell us whether the path we put is exist in our system or not. that will give true
		//this whole code will only work for our system bcoz we have given our sytem path ("C:\\Users\\MUKUL S ANAND\\Downloads\\Converted.jpg") but if incase if 
		//jenkins run on different server and server path would be different. So this code is machine dependent but we need dynamically get the path
		
				

		
		File f=new File(downloadPath+"/converted.jpg");  //downloadpath object will have the path till (E:\Eclipse\JavaPractice). No matter in which machine we are working
		if(f.exists()){						
			
			Assert.assertTrue(f.exists()); //it will give true if file is present elase the test will fail
			
			if(f.delete());
			System.out.println("The file is deleted");
			
			//System.out.println("file found"); instead of using this step, we can use here assrtions
			//if incase we dnt found the file, the test will get fail
		}
	
	}

}
