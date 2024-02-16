package WebElementLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFbAccount {

	public static void main(String[] args) throws InterruptedException {
		
		//Locators : id,name,xpath,cssSelector,classname,tagname)
		//xpath : text(),conatins(),starts-with()
					//and,or,indexing or chaining
		//cssSelector : id,class,attrtibute
		
		System.setProperty("webdriver.chrome.driver","..\\SeleniumProjectSample\\Drivers\\chromedriver.exe");
		
		//Launch a Browser
		WebDriver driver= new ChromeDriver();
			
		//maximize the brwser
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("https:\\www.facebook.com");
		
		WebElement createAcc= driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]"));
		////a(contains(@data-testid,'open-registration-form-button') or @data-testid="open-registration-form-button"))
		createAcc.click();
		
		//Sign Up WebElement	
		
		//driver.switchTo().frame(0)
		WebElement signup= driver.findElement(By.xpath("//div[contains(text(),\"Sign Up\")]"));
		String text=signup.getText();
		if (text.contains("Sign Up"))
				{System.out.println("Create an new account page is opened");}
		else
			{System.out.println("Create an new account page is not opened");}
		
		
		
	}

}
