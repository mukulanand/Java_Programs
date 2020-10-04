package windowControlWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingPopUPs {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\work\\chromedriver.exe");
		//chromedriver is a class which is implementing webdriver interface. 
		
		WebDriver driver=new ChromeDriver();
		//follow this syntax which u can used before the url
		//http://Username:Password@SiteURL
		//Most of the people used Auto IT to handle this but whatever we have done is the easiest way
		driver.get("http://admin:admin@the-internet.herokuapp.com/");		
		driver.findElement(By.linkText("Basic Auth")).click();
	}

}
