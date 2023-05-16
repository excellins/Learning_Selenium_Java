import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9_83_fluentWaitTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FLUENT WAIT IS EXPLICIT WAIT ALSO, LIKE WEBDRIVER WAIT
				//FLUENT WAIT FINDS WEB ELEMENT REPEATEDLY UNTIL TIMEOUT OR OBJECT GETS FOUND
				//DIFF WITH WEBDRIVER WAIT IS IT MOITORS FOR WEBELEMENT AT REGULAR INTERVALS OF TIME
				//WEBDRIVER WAIT KEEPS ON LISTENING TO DOM FOR OBJECT, IF U GVE 10 SEC TIMEOUT,
				//IT KEEPS LOOKING FOR OBJECT
				//FLUENT WAIT WE GIVE POLLING TIME SO IT ONLY MONITORS ON REGULAR INTERCAL OTF TIME
				//EG FLUENT WAIT = 10 SECS, POLLING 2 SEC, IT CHECK REGULARLY FOR EVERY 2 SECONDS
				
				//WEB DRIVER WAIT CONTINUESLY MONITORS, THERES NO POLLING
				//FLUENT WAIT DOESNT ACTUALLY MONITOR, JUST AT REGULAR INTERVALS OF TIME
				
				//when i used fluent wait (very rare case scenario)
				//fluentWait = 10 seconds, polling 4 seconds., 
				//you have a program that displays "Something1" within 10 seconds, and then>>
				//>>"Something2" within nthe next 4 seconds, fluwnt wait checks for
				//something1, then wait again to check for something two especially when they have same eement 
				//this could be a problem ut solved for fluentwait
				//if you use fluent wait, it checks for 0 secs, then it wont monitor until 4sec
				//>> because fluent only check at regular intervals
				
				//WEB DRIVER WAIT, IN THE ABOVE CASE SAW THAT SOMETHING1 AND ASSUME THATS ALL IT NEEDS TO DO
				//AND THATS ALL, FLUENT WAIT POLLING 4 SECS WAITS ANOTHER 4 SECS TO PICK THE NEXT ITEM
				
				//Both webdriver wait and fluentWait classes implement Wait Interface
			
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);//remember chrome driver is just a class implementing webdriver interface
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();//we did this because we moced from one locator to child, css thats why we use space, this is
		//>> how the xpath equivalent will be (".//*[@id='start']/button")
		//FLUENTWAIT IS ALSO A CLASS IMPLEMENTING WAIT INTERFACE
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		//AFTER ABOVE WE NEED TO SPECIFY WHAT OBJECT DO WE WANT TO GIVE THAT FEATURE OF WAITING, AS SEEN BELOW
		//wait.until(null)
		//FLUENT WAIT DOESN GIVE US ANY PREDEFINED FUNCTION TO WORK, REMEMBER WITH WEBDRIVER WAIT WE DID BELOW
		//WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(20));
		//waiting.until(ExpectedConditions.elementToBeClickable(By.id("ID")));//Fluent wait doesnt give us this
		
		//WebDriverWait n = new WebDriverWait(driver, Duration.ofSeconds(20) );
		driver.manage().timeouts().implicitlyWait(null)
		//WITH FLUENT WAY WE DEFINE OUR OWN CUSTOMIZED WAIT OR FUNCTIONS LIKE BELOW
		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else
					return null;
		}
	});
		
		
		
		//EASIER METHOD OF THE ABOVE CODE IS BELOW COMMENTED 
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id = 'finish'] h4")));
		//if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
		//	driver.findElement(By.cssSelector("[id='finish'] h4"));
		//}
		
System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}
	
	//Both webdriverWait and FluentWait classes implement Wait Interface
		
	

}
