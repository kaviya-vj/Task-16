package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//i[text()='Search']")).click();
		driver.findElement(By.xpath("//span[text()='View history']")).click();
		WebElement title = driver.findElement(By.id("firstHeading"));
		System.out.println("Page title: "+title.getText());
		
		
	}
}
