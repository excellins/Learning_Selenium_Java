import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingJSAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Collins Eban"; //declaring the string to insert
		
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys(text);
		
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		//from above we can handle the pop up, now how can we interact with the pop?
		//considering it isnt directly tied to the html
		//IN SELENIUM WE HAVE A METHOD TO SWITCH TO ALERTS
		//driver.switchTo().alert();//from here we switch our context from our driver browser to alert
		//1. driver = our webdriver
		//2. switchTo() = sends future commands to a different window or frame
		//alert() = Switches to the currently active modal dialog for this particular driver instance
		
		driver.switchTo().alert().getText();//to get the alert text and print below
		
		System.out.println(driver.switchTo().alert().getText());//sysout select control and hit space
		
		driver.switchTo().alert().accept();//Accept alerts
		//now what if we have a window with 2 buttons? EG confirm and cancel?
		//first we get confirm button see below
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//1. Positive to click on ok you use accept method
		//2. negative mode, eg cancel you use dismiss as shown above
		
		//when you use dismiss selenium will intelligently find the negative cope and click it
		//we dont have object available to handle
	}

}
