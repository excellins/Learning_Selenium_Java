import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSeuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//there are drop down that comes based on your input, you input in and it shows india for example
		
		driver.findElement(By.id("autosuggest")).sendKeys("India");
		Thread.sleep(3000);
		 
		driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//notice above we use find element (s) we are getting more than one item thats why
		//the return type of find elements is list of element
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)//anytime loop iterate we pick an option
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		
		String[] name = {"Collins", "Abang", "Eban"};
		for(int z = 0; z < name.length; z++)
		{
			System.out.println(name[z]);
		}
		
		//AN ENHANCED LOOP IS AS BELOW
		for(String s: name)
		{
			System.out.println(s);
		}
	}

}
