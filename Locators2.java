import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "rahul";//FOR LINE 41 and 27
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(ops);
		
		//TO USE FIREFOX
		//System.setProperty("webdriver.gecko.driver", "/Users/collins.eban/Documents/gecko.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//TO USE EDGE
		//System.setProperty("webdriver.edge.driver", "/Users/collins.eban/Documents/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Locators2 ht = new Locators2();//you can call by creating an instance of a class
		//ht.getPassword(driver);//calling via object or change method to static like below
		String password = getPassword(driver);//calling without creating an object
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOf(null));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");//BEFORE, LOOK BELOW FOR AFTER
		//driver.findElement(By.name("inputPassword")).sendKeys(password);//BEFORE, LOOK BELOW FOR AFTER
		driver.findElement(By.name("chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(1000);
		
		
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		//findElement(By.cssSelector("div[class='login-container'] h2")).getText();//We use tag name, we can also use parent to chuld by this: div[class='login-container'] h2
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " +name+",");//but this failes because its a dynamid username
		//we can also find a button element by using this //button[text()='Log Out'] instead of tagename (button) we can use *
		//* can be anything can be input, span etc
		//in a case with several text you can uniquely specify button
		driver.findElement(By.xpath("//button[text()='Log Out']"));
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//"Please use temporary password 'rahulshettyacademy' to Login."
		//passwordText.split(text);
		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login
		String[] passwordArray = passwordText.split("'");
		//passwordArray[1].split("'")[0]//or you can use below
		//String[] passwordArray2 =  passwordArray[1].split("'"); OR YOU CAN USE BELOW
		String password = passwordArray[1].split("'")[0];
		return password;
		//0th index - rahulshettyacademy
		//1st index - to Login
	}

}
