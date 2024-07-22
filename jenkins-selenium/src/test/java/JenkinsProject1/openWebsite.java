package JenkinsProject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openWebsite {
	WebDriver driver =new ChromeDriver();
	
	@Test
	public void website() {
		driver.get("https://www.facebook.com123/");
		driver.findElement(By.name("email")).sendKeys("ssssssssssssssssss");
		driver.findElement(By.name("pass")).sendKeys("rrrrrrrrrrrrrrrrrrrrrrrrr");
		driver.findElement(By.name("login")).click();
		
	}
	@Test
	public void Demoqa() {
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Dhoni");
		driver.findElement(By.id("userEmail")).sendKeys("Dhoni@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("CAddress");
		driver.findElement(By.id("permanentAddress")).sendKeys("pAddress");
		driver.findElement(By.id("submit")).click();
		
		
	}

}
