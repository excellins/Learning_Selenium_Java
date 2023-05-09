import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9_BaseExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/collins.eban/Documents/chromedriver.exe");

		String[] itemsNeeded = { "Cucumber", "Brocolli" };

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ENSURE YOU VIEW SECTION9_BASE BEFORE THIS
		//EXPLICIT WAIT COMES IN TWO TYPES, WEBDRIVER WAIT AND FLUENT WAIT
		//IT ISNT USED GLOBALLY IT TARGETS A SPECIFI WEBELEMTN, LOOK AT LINE 41
		//>>>>>>.explicit wait pros<<////
		//only applied whereever you require, target only to specifi elements, unlike implicit
		//no performance issues
		//DISADVANTAGE//////////////////////
		//REquires more lines of code, implict does this better because you declare gliabally and thats all
		
		//if you dont know the steo your application will get slow i suggest you go with implicit wait
		//because you cant apply explicit wait for each and every line
		//both wait are used thats why selenium allowed them, it depends on your organisation
		
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("collinsAcademy");
		//remember css you can simply say tagename . className eg input.promoCode
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//driver.findElement(By.cssSelector("span.promoInfo")).getText();//TO GET THE TEXT
		//IF YOU BELIVE THE span.promoInfo IS AN ISSUE YOU CAN DEFINE EXPLICIT WAIT FOR IT
		//the explicit wait will have no effect on any other step
		//WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(20));
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

	// WANT TO WRITE REUSABLE METHODS? WRITE IT OUTSIDE OF PUBLIC STATIC VOID MAIN method
	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
		Thread.sleep(5000);
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(name)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == itemsNeeded.length)
						break;

			}
		}

	}

}
