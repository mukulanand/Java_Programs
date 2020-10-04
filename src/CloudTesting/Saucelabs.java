package CloudTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Saucelabs {
	//copy this code from link ::-->>https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Selenium+for+Automated+Website+Testing
	
	  public static final String USERNAME = "Mukul";
	  public static final String ACCESS_KEY = "Get YOUR_ACCESS_KEY from account-> user setting";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	
	public static void main(String[] args) throws MalformedURLException {
			//here we will not perform automation on local browser like chrome
		
		//Link for platform Configurator::-->>https://wiki.saucelabs.com/display/DOCS/Platform+Configurator
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 7");
		browserOptions.setCapability("browserVersion", "59.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), sauceOptions);
		//this RemoteDriver expects two arguments, one is connection of the remote webdriver and second is 
		//capability object which include browser and os info and then it executes the particular  remote VM. All that remote vm are present is sauce labs
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	
	
	}

}
