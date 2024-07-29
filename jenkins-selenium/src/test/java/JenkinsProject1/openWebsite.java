package JenkinsProject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

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
	public void Demoqa() throws InterruptedException {
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Dhoni");
		driver.findElement(By.id("userEmail")).sendKeys("Dhoni@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("CAddress");
		driver.findElement(By.id("permanentAddress")).sendKeys("pAddress");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		String name1= driver.findElement(By.id("name")).getText();
		String name0="Dhoni";
		if(name1.equals(name0)) {
			System.out.println("susss");
		}
		else {
			System.out.println("fail");
		}
		
	}
	@Test
	public void Amozon() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@id='405da5c4-936c-4843-a9ee-7d88cc91a9a4']//following::a[contains(text(), 'See all offers')]\r\n"
			//	+ "")).click();
	}

}
