package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		// Invoking the browser 
		// Chrome -ChromeDriver
		//Firefox- irefoxDriver
		//Edge- EdgeDriver
//ChromeDriver driver = new ChromeDriver(); Not valid because all the drivers are implement of the interface called WebDriver.
		// WebDriver - is the interface- Methods in interface are abstract.
		

		WebDriver driver = new FirefoxDriver();	
	//to maximise the browser
		driver.manage().window().maximize();
	//open google.com
		driver.get("http://google.com");
	//print the current url	
		String url = driver.getCurrentUrl();
		System.out.println(url);
	//reload the browser	
		driver.navigate().refresh();
		driver.close();
		

	}

}
