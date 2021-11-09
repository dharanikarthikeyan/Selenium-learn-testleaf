package week2day2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceAssigment2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//select first name
		driver.findElement(By.name("UserFirstName")).sendKeys("Dharani");
		//select last name
		driver.findElement(By.name("UserLastName")).sendKeys("Karthikeyans");
		
		//select mailid
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("darnimca@gmail.com");
		
		//select jobtitle
		Select sel_jobtitle= new Select(driver.findElement(By.xpath("//select[@name='UserTitle']")));
		sel_jobtitle.selectByVisibleText("Student / Personal Interest");
		
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Hunters");
		
		//select employes
		Select selemplcount= new Select(driver.findElement(By.xpath("//select[@name='CompanyEmployees']")));
		selemplcount.selectByVisibleText("1 - 15 employees");
		
		//select phone
		driver.findElement(By.xpath("//Input[@name='UserPhone']")).sendKeys("96770868815");
		
		//select country
		Select selcountry= new Select(driver.findElement(By.xpath("//select[@name='CompanyCountry']")));
		selcountry.selectByVisibleText("India");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		

		
		//agree statement1
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		
		
		//click on start my freetrial tab registration submission
		driver.findElement(By.xpath("//button[text()='start my free trial']")).click();
		
		
//		//agree statement2
//		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
//		
//		//agree statement3
//		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[3]")).click();
//		Select selstate=new Select(driver.findElement(By.name("CompanyState")));
//		selstate.deselectByValue("Goa");
		
		
}
}
