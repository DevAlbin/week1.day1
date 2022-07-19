package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringValueComparisionTitle {

	
	public static void main(String[] args) throws InterruptedException {
		String Title1 = "Leaftaps -  Automation Platform";
		//String title = driver.getTitle();
		//if (Title1.equals(title)) {
			//System.out.println("title is same");}
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	//driver.manage().window().minimize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).submit();
	String title2 = driver.getTitle();
	if (Title1.equals(title2)) {
	System.out.println("title is same");}
	else {System.out.println("title is different");}
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AK");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop1 = new Select(source);
	drop1.selectByVisibleText("Employee");
	WebElement mrkcpn = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select drop2 = new Select (mrkcpn);
	drop2.selectByValue("CATRQ_AUTOMOBILE");
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select drop3 = new Select(industry);
	drop3.selectByIndex(10);
	driver.findElement(By.name("submitButton")).submit();
	String title3 = driver.getTitle();
	System.out.println(title3);
	}

}
