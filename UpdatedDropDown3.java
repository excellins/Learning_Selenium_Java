import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class UpdatedDropDown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://spicejet.com");
		//Assert.assertFalse(condition);//to tell the system that we want the condition to fail thats why we say assert false
		//Assert.assertFalse() only expects false value 
		//we are saying i want a false to be passed into the argument, it there is a false the test passes if not it fails
		//Assert.assertFalse(True) will fail because we expects false
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).click();
		
		//since below returns true we want to create an assert for true
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).isSelected());
		//IF YOU WANT TRUE TO BE RETURNED USE THE METHOD BELOW, THE METHOD WILL ALWAYS EXPECT TO RETURN TRUE
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniroCitizenDiscount']")).isSelected());
		//THE ABOVE WILL NOT ACCEPT FALSE, IF YOU PASS FALSE IT WILL FAIL THE TEST BECAUSE YOU INSERTED FALSE AND THE METHOD I EXPECTING A TRUE
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("ct100_mainContent_rbtnl_Trip_1")).click();//select the round trip option
		//WE ARE TRYING TO FIND OUT IF AN ELEMENT IS ENABLED OR DISABLED
		//IN ALL THINGS YOU HAVE TO LOCATE THE ELEMENT FIRST BEFORE YOU EVEN TAKE AN ACTION ON THE ELEMT 
		//driver.findElement(By.name("ct100$mainContent$view date2")).isEnabled();
		//IS ENABLED HELPS US TO CHECK IF AN ELEMENT IS ENABLED OR NOT AS SEEN ABOVE, BUT...
		System.out.println(driver.findElement(By.name("ct100$mainContent$view date2")).isEnabled());
		
		// it has issues checking if enabled or diabled because on click the date attri is enabled
		//so we monitor changes in attribute uplon clicking
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ct100_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.name("Div1")).getAttribute("style"));
		//we are trying to get the attribute, this attriute changes in response to radio button clicks
		//so we check for those changes
		
		//CHECKING TO SEE IF OUR ATTRIBUET CONTAINS VALUE 1
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it is enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
	}

}
