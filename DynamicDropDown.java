import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://spicejet.com");
		//a[@value="MAA"] - xpath for chennai
		
		//a[@value='VLR'] - xpath for bal
		//if two xpath of same value are find you need tell selenium which to click
		//(//a[@value="MAA"])[2]
		
		//first drop down below
		driver.findElement(By.id("ct100 mainContent ddl originStation CTXT")).click();
		
		//second dropdown
		driver.findElement(By.xpath("a//[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("a//[@value='MAA']")).click();//gives error because they are 2 and we need the second
		
		driver.findElement(By.xpath("(a//[@value='MAA'])[2]")).click();//we use index to specify
		//but there are people who have issues with Indexes and wont want above, how then will you handle that? look below
		//YOU CAN ACTUALLY GET A PARENT XPATH, AND THEN A CHILD XPATH LINKED TOGETHER LIKE BELOW
		//IN THIS CASE IT IS CALLED PARENT CHILD RELATIONSHIP
		
		driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_destinationStattion1_CTNR'] //a[@value='MAA']"));
		//where this: //div[@id='glsct100_mainContent_ddl_destinationStattion1_CTNR'] is the parent and 
		////a[@value='MAA] is the child
	}

}
