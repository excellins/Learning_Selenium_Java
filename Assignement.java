import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		 
		 System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		 driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		 System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		 
		 //Select selectElement = new Select(check);
		 //selectElement.deselectByIndex(0);
		
		
		 driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		 
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 
		 
		 
		 	//WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 
			//Select dropdown = new Select(staticDropdown);//picks webElement thats why we pass it there
			//dropdown.selectByIndex(3);
			//System.out.println(dropdown.getFirstSelectedOption().getText());
			
			//dropdown.selectByVisibleText("AED");
			//System.out.println(dropdown.getFirstSelectedOption().getText());
			//dropdown.selectByValue("INR");
			//System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
