package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
			// open google.com
			driver.get("https://WWW.demoblaze.com");
			// to maximise the browser
			driver.manage().window().maximize();

			// get and print the title of the webpage
			String title = driver.getTitle();
			System.out.println("Current Page Title: " + title);
			// verify the current title
			if (title.equals("STORE")) {
				System.out.println("Page landed on correct website");
			} else {
				System.out.println("Page not landed on correct website");
			}
		

	}

}
