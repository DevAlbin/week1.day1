package week3day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("https://www.zoomcar.com/in/bangalore");
		//max the window
		driver.manage().window().maximize();
		//wait

	}

}
