package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {

	private WebDriver driver;

	public void setupBrowser(String browser, String url) {
		//open browser
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("valid browser was not provided, hence quitting the automation run");
			System.exit(0);
		}
		
		//open url
		if(!url.isBlank())
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeTab() {
		driver.close();
	}
	
	public void quitTab() {
		driver.quit();
	}

}
