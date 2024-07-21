package JenkinsProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openWebsite {
	
	@Test
	public void website() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com123/");
		driver.findElement(By.name("email")).sendKeys("ssssssssssssssssss");
		driver.findElement(By.name("pass")).sendKeys("rrrrrrrrrrrrrrrrrrrrrrrrr");
		driver.findElement(By.name("login")).click();
		
	}

}
