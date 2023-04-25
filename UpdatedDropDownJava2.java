import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


//TESTNG is one of the testing frame work
//assertion helps us in validation, if result is expected or not, testNG provides the future of assertion
public class UpdatedDropDownJava2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://spicejet.com");
		
		driver.findElement(By.id("ct100_mainContent_ddl_originStattion1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		 
		//.ui-state-default ui-state-highlight ui-state-active
		//notice the above class with spaces? in this scenario remove the spaces and use . like below
		//.ui-state-default.ui-state-highlight.ui-state-active
		driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ffl_destinationStation1_CTNR'] //a[@value='MAA']"));
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		
	}

}

