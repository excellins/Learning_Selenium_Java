import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		// INVOKE BROWSER
		
		//Chrome - ChromeDriver -> Methods
		//Interface methods with empty bodies
		//the classes that call the interface will implement it by providing bodies
		//ChromeDriver driver = new ChromeDriver();
		//This isnt a good idea because its chromedriver, IT WILL ACCESS JUST CHROMEDRIVER METHODS AND WONT WORK ON OTHER BROWSERS
		//CHROME DRIVER HAS ITS OWN METHODS AND CALLING IT WHEN USING FIREFOX DRIVER WONT WORK SO BETTER TO USE WEBDRIVER
		
		//CHROME DRIVER.EXE
		//set property set property on global level
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\collins.eban\\Documents\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//FROM ABOVE WE ARE ONLY IMPLEMENTING WEBDRIVER IMPLEMENTED METHODS, and will work on other browsers
		//writing chromedriver, wont work if it acess personal chromedriver methods
		
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");// * is regular expression for allow anything, remotely allow all websites 
		
		//CHROME DRIVER
		//WebDriver driver = new ChromeDriver(ops);
		
		//FIRE FOX LAUNCH
		//gecko driver
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "/Users/collins.eban/Documents/geckodriver.exe");
		
		//MICROSOFT EDGE BROWSER
		System.setProperty("webdriver.edge.driver", "/Users/collins.eban/Documents/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//validate to see if you successfully navigate to url
		System.out.println(driver.getCurrentUrl());
		
		//driver.getPageSource();
		  
		System.out.println(driver.getPageSource());
		//Thread.sleep(1000);
		//driver.quit();//QUITS THE DRIVER (CLOSES ALL WINDOWS OPENED BY SELENIUM)
		//driver.close();//CLOSES CURRENT WINDOW (ONLY THE ORIGINALLY OPENED BROWSER IS CLOSED)
		
	}

}
