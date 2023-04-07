import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://google.com");//using this selenium wait until this url is loaded (waits for al coponenet)
		driver.navigate().to("https:////rahulshettyacademy.com");//using this selenium will not wait only for basic component
		driver.navigate().back();//takes you back to google pge
		driver.navigate().forward();
		//comes handy when doing end to end 
				

	}

}
