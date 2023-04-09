import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://spicejet.com");
		
		driver.findElement(By.id("divpaxinfo")).click();
		//we have to give three clicks
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		//but is the above good practice? No, so we create a loop
		
		//driver.findElement(By.id("btnclopsepaxoption")).click();
		
		//IF WE HAVE REQUIREDMENT TO SELECT 5? WE CLICK 5? NO WE DO BELOW
		int i = 1;//initialisation 1st
		
		while(i<5)//compare 2nd
		{
			driver.findElement(By.id("hrefInAdt")).click();//executed 4 times (CONDITION)
			i++;//s
		}
		
		//USING FOR LOOP
		for (int p = 1; p < 5; i++ )//in for loop you write everything in a single line
		{
			driver.findElement(By.id("hrefInAdt")).click();
			driver.findElement(By.id("divpaxinfo")).getText();//just to check we get right output by below
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
		}
		
		
		driver.findElement(By.id("btnclopsepaxoption")).click();
		
		

	}

}
