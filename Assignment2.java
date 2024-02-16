package co.edurekatraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoke a web Browser
		WebDriver driver = new ChromeDriver();
		
		//Open Rediffmail
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("CurrentUrl= "+ CurrentUrl );
		
		//xpath 
		WebElement moneyLinkXPath= driver.findElement(By.xpath("//a[@class='moneyicon relative']"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//css Selector :By ClassNmae : tag.className
		//				By ID	       tag#IdValue
		//				By Attribute   tag[attribute=attributeValue]
		WebElement moneyCss = driver.findElement(By.cssSelector("a.moneyicon"));
		
		Boolean value=moneyCss.isDisplayed();
		if (value=true )
		{ 	System.out.println ("Money link is displayed") ;}
		else 
		{	System.out.println ("Money link is not displayed");}
			
		System.out.println("-----------------------------------------------");
		
		//Thread.sleep(7000);
		
		//Inspect all text boxes with name locator
		List<WebElement> textBox = driver.findElements(By.xpath("//input[@type='text']"));
		
		//printing the list of text boxes in the page
		//for each loop (Iterating the webelement against the list of webElements
		for (WebElement textNames : textBox) {			
			String textBoxNames=textNames.getAttribute ("placeholder");
			System.out.println("The Name of the text box is " +textBoxNames);
		}
		System.out.println("-----------------------------------------------");
		
		WebElement searchBox = driver.findElement(By.cssSelector("input#srchquery_tbox"));
		String SearchBoxName=searchBox.getAttribute("placeholder");
		System.out.println(" The text box searched with ID attribute is : "+SearchBoxName);
				
		System.out.println("-----------------------------------------------");
		
		//REdiffMail logo
		WebElement logoName = driver.findElement(By.xpath("//span[@class='hmsprite logo']"));
		Boolean val1=logoName.isDisplayed();
		if (val1=true )
		{ 	System.out.println ("Rediff mail logo is displayed") ;}
		else 
		{	System.out.println ("Rediff mail logo is not displayed");}
		
		System.out.println("-----------------------------------------------");
		//Enterprise Email 		
		WebElement enterpriseEmail = driver.findElement(By.xpath("//a[@title='Lightning fast business email hosting']"));
		Boolean val2=enterpriseEmail.isDisplayed();
		if (val1=true )
		{ 	System.out.println ("Enterprise Email is displayed") ;}
		else 
		{	System.out.println ("Enterprise Email  is not displayed");}
		
		System.out.println("-----------------------------------------------");
		
		//videos 
		WebElement video = driver.findElement(By.xpath("//a[@class='vdicon']"));
		Boolean val3=video.isDisplayed();
		if (val3=true )
		{ 	System.out.println ("Video icon is displayed") ;}
		else 
		{	System.out.println ("Video icon is not displayed");}
		
		System.out.println("-----------------------------------------------");
			
		WebElement businessEmail = driver.findElement(By.xpath("//a[@class='mailicon']"));
		Boolean val4=businessEmail.isDisplayed();
		if (val4=true )
		{ 	System.out.println ("Business Email is displayed") ;}
		else 
		{	System.out.println ("Business Email is not displayed");}
		
				
		System.out.println("-----------------------------------------------");
		//Shopping
		
		WebElement shoppingIcon = driver.findElement(By.xpath("//a[contains(text(),'Shopping')]"));
		Boolean val5=shoppingIcon.isDisplayed();
		if (val5=true )
		{ 	System.out.println ("Shopping Icon is displayed") ;}
		else 
		{	System.out.println ("Shopping Icon  is not displayed");}
			
	
		System.out.println("-----------------------------------------------");
		
		//Sign In
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		Boolean val6=signIn.isDisplayed();
		if (val6=true )
		{ 	System.out.println ("Sign In is displayed") ;}
		else 
		{	System.out.println ("Sign In is not displayed");}
		
		System.out.println("-----------------------------------------------");
		//Create Account
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create Account']"));
		Boolean val7=createAccount.isDisplayed();
		if (val7=true )
		{ 	System.out.println ("Create Account is displayed") ;}
		else 
		{	System.out.println ("Create Account is not displayed");}
		
		System.out.println("-----------------------------------------------");
		//Click on Sign In link
		signIn.click();
		WebElement userNameBox = driver.findElement(By.xpath("//p[contains(text(),'Username')]"));
		Boolean userNameBoxVal=userNameBox.isDisplayed();
		if (userNameBoxVal=true )
		{ 	System.out.println ("Sign In Page is displayed") ;}
		else 
		{	System.out.println ("Sign In Page is not displayed");}
		
		driver.close();
		

	}

}
