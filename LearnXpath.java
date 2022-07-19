package week3day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//max the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//title page
		String Title =  driver.getTitle();
		System.out.println(Title);

	}

}
