package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		// setup the path
		WebDriverManager.edgedriver().setup();
		//to open the browser
		EdgeDriver driver = new EdgeDriver();
		//open the website
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//to get the title 

		String title = driver.getTitle();
						System.out.println(title);
		//enter user
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login button
				driver.findElement(By.className("decorativeSubmit")).click();
	}

}
