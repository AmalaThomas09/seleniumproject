package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dreams\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();

		driver.findElement(By.name("firstName")).sendKeys("Amala");

		driver.findElement(By.name("lastName")).sendKeys("Thomas");

		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

		

		



		// TODO Auto-generated method stub



	}}
	
		
		// TODO Auto-generated method stub

	


