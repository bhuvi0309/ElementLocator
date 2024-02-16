package WebElementLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "..\\SeleniumProjectSample\\Drivers\\chromedriver.exe");
		
		
		//Launch a webBrowser
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//id locator
		WebElement Email=driver.findElement(By.id("email"));
		Email.click();
		Email.clear();
		Email.sendKeys("bhuvi.tulip@gmail.com");		
		
		WebElement logo= driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]"));
		String logotext=logo.getText();
		System.out.println("The logo is "+logotext);
				
		//LinkText locator
		WebElement hyperlink= driver.findElement(By.linkText("Create a Page"));
		hyperlink.click();
		
		driver.navigate().back();
		
		
		
		
	}

}
