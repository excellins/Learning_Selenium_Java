import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


//TESTNG is one of the testing frame work
//assertion helps us in validation, if result is expected or not, testNG provides the future of assertion
public class Assertions {

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
		
		
		
		
		
		for (int i = 1; i < 5; i++ )//in for loop you write everything in a single line
		{
			driver.findElement(By.id("btnclopsepaxoption")).click();
			//NOW WE WANT TO USE ASSERT ALSO TO CHECK IF OUR CONDITION IS CORREVT 
			//assert Equals actually compares two arguments
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			driver.findElement(By.id("divpaxinfo")).getText();//just to check we get right output by below
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
		}
	}

}
