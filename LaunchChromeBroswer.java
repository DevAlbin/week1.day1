package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBroswer {

	public static void main(String[] args) {
		// 1. Setup the path for the driver
		WebDriverManager.chromedriver().setup();
		//2. launch the driver - which broswer
		ChromeDriver driver =new ChromeDriver();
		//3. to open gmail
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maxmize/full screen
		driver.manage().window().maximize();
		//Add wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//get the title
				String title = driver.getTitle();
		System.out.println(title);
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click login button
		driver.findElement(By.linkText("CRM/SFA")).click();
        //click Leads
        driver.findElement(By.linkText("Leads")).click();
        //click create lead
        driver.findElement(By.linkText("Create Lead")).click();
        //Enter the company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        //Enter the first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Albin");
      //Enter the last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pitchiah");
      //handle the dropdown
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
       //ctrl+2+l findElement returns WebElement
       Select drop1=new Select(source);
       //Select By visible text
      //drop1.selectByVisibleText("Conference");
       //Select By value
      // drop1.selectByValue("LEAD_DIRECTMAIL");
       //Select by index
       drop1.selectByIndex(8);
        
      //Click Create Lead
      //  driver.findElement(By.)
       driver.findElement(By.name("submitButton")).click();
       String title1 = driver.getTitle();
       System.out.println(title1);
	}

}
