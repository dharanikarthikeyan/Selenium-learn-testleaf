package week2day2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbookassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		//create new account
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anshi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kk");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	    sel1.selectByIndex(4);

	    Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
	    sel2.selectByValue("6");

	    Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
	    sel3.selectByValue("2013");
	
	    driver.findElement(By.name("reg_email__")).sendKeys("fortestdaras87@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("fortestdaras87@gmail.com");
	    

	    driver.findElement(By.name("reg_passwd__")).sendKeys("beready2022");
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    
	    driver.findElement(By.name("websubmit")).click();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    


	}

}

//driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("967708681");
//driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("calculate");
//driver.findElement(By.id("u_2_g_my")).sendKeys("967708681");
//driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("spark2021");
//mobile------------> (//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[3]
//driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[3]")).sendKeys("123dfsdf");
//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
